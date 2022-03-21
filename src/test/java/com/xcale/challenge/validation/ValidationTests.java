package com.xcale.challenge.validation;

import com.xcale.challenge.dto.GroupRequestDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ValidationTests {

    @Test
    public void WHEN_validate_ID_THEN_success() throws Exception {
        GroupRequestDTO request = new GroupRequestDTO("1", "Message", new ArrayList<>();
        Assertions.assertDoesNotThrow(() -> GroupValidation.validate(request));
    }

    @Test
    public void WHEN_validate_group_ID_THEN_fail() throws Exception {
        GroupRequestDTO request = new GroupRequestDTO(null, "Message", new ArrayList<>();
        Assertions.assertThrows(Exception.class, () -> GroupValidation.validate(request));
    }

    @Test
    public void WHEN_validate_message_THEN_fail() throws Exception {
        GroupRequestDTO request = new GroupRequestDTO("1", null, new ArrayList<>();
        Assertions.assertThrows(Exception.class, () -> GroupValidation.validate(request));
    }

    @Test
    public void WHEN_validate_ID_THEN_fail() throws Exception {
        GroupRequestDTO request = new GroupRequestDTO("1", null, new ArrayList<>();
        Assertions.assertThrows(Exception.class, () -> IdValidation.validateId("1"));
    }
}
