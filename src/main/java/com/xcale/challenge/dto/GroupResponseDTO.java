package com.xcale.challenge.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class GroupResponseDTO {

    HttpStatus status;

    public GroupResponseDTO(HttpStatus status) {
        this.status = status;
    }
}
