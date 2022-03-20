package com.xcale.challenge.dto;

import org.springframework.http.HttpStatus;

public class GroupResponseDTO {

    HttpStatus status;

    public GroupResponseDTO(HttpStatus status) {
        this.status = status;
    }
}
