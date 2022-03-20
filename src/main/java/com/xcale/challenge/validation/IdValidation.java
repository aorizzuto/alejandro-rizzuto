package com.xcale.challenge.validation;

public class IdValidation {
    public static void validateId(String id) throws Exception {
        if (id.isBlank() || id.isEmpty()) throw new Exception("Id should not be null or empty");
    }
}
