package com.xcale.challenge.dto;

import com.xcale.challenge.repository.model.Contact;
import lombok.Data;

import java.util.List;

@Data
public class GroupRequestDTO {
    String userId;
    String message;
    List<Contact> contacts;
}
