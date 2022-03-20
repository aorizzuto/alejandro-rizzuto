package com.xcale.challenge.validation;

import com.xcale.challenge.exception.ErrorCode;

public class IdValidation {
    public static void validateId(String id) throws Exception {
        if (id.isBlank() || id.isEmpty()) throw new Exception(ErrorCode.ID_NULL);
    }
}
