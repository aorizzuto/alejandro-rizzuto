package com.xcale.challenge.validation;

import com.xcale.challenge.dto.GroupRequestDTO;

public class GroupValidation {
    public static void validate(GroupRequestDTO request) throws Exception {
        validateOriginId(request.getUserId());
        validateMessage(request.getMessage());
    }

    private static void validateMessage(String message) throws Exception {
        if (message.isBlank() || message.isEmpty()){
            throw new Exception("Message must not be null");
        }
    }

    private static void validateOriginId(String userId) throws Exception {
        if (userId.isEmpty() || userId.isBlank()){
            throw new Exception("Origin User Id must not be null");
        }
    }
}
