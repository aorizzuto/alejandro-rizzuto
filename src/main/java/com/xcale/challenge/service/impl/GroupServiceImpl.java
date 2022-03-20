package com.xcale.challenge.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xcale.challenge.dto.ContactDTO;
import com.xcale.challenge.dto.GroupRequestDTO;
import com.xcale.challenge.dto.GroupResponseDTO;
import com.xcale.challenge.repository.ContactsRepository;
import com.xcale.challenge.repository.model.Contact;
import com.xcale.challenge.service.IGroupService;
import com.xcale.challenge.validation.GroupValidation;
import com.xcale.challenge.validation.IdValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.stream.Collectors;

public class GroupServiceImpl implements IGroupService {
    @Autowired
    ContactsRepository contactsRepository;

    @Override
    public void validate(String id, GroupRequestDTO request) throws Exception {
        IdValidation.validateId(id);
        GroupValidation.validate(request);
    }

    @Override
    public GroupResponseDTO process(String id, GroupRequestDTO request) throws JsonProcessingException {
        List<ContactDTO> contactList = getContactsInGroup(id);
        return sendMessageToContacts(contactList, request.getMessage());
    }

    private GroupResponseDTO sendMessageToContacts(List<ContactDTO> contactList, String message) {
        // In here we can use SQS from AWS or call another API to apply the message
        contactList.forEach(this::callApiToSendMessage);

        return new GroupResponseDTO(HttpStatus.OK); // If this line is executed it means that it was OK
    }

    private void callApiToSendMessage(ContactDTO user) {
        // Call API to send message to "user"
    }

    private List<ContactDTO> getContactsInGroup(String id) {
        return contactsRepository.findContactsByGroupId(id)
                .stream()
                .map(Contact::toDTO)
                .collect(Collectors.toList());
    }
}
