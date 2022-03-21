package com.xcale.challenge.dto;

import com.xcale.challenge.repository.model.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupRequestDTO {
    String userId;
    String message;
    List<Contact> contacts;
}
