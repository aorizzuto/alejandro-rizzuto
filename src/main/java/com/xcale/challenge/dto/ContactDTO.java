package com.xcale.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactDTO {
    private Long id;
    private Integer name;
    private String phoneNumber;
}
