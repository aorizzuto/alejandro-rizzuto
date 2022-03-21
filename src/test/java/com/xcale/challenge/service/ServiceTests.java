package com.xcale.challenge.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xcale.challenge.dto.GroupRequestDTO;
import com.xcale.challenge.repository.IContactsRepository;
import com.xcale.challenge.service.impl.GroupServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

public class ServiceTests {

    GroupServiceImpl service = Mockito.spy(GroupServiceImpl.class);
    IContactsRepository repository = Mockito.mock(IContactsRepository.class);

    @Test
    public void WHEN_proccess_valid_request_THEN_success() throws JsonProcessingException {
        Mockito.when(repository.findContactsByGroupId(anyString())).thenReturn(new ArrayList<>());

        assertDoesNotThrow(() -> service.process("1", new GroupRequestDTO()));
    }

    @Test
    public void WHEN_proccess_invalid_request_THEN_fail() throws JsonProcessingException {
        Mockito.when(repository.findContactsByGroupId(anyString())).thenThrow(new Exception());

        assertThrows(Exception.class, () -> service.process("1", new GroupRequestDTO()));
    }
}
