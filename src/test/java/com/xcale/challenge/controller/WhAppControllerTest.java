package com.xcale.challenge.controller;

import com.xcale.challenge.dto.GroupRequestDTO;
import com.xcale.challenge.dto.GroupResponseDTO;
import com.xcale.challenge.repository.IContactsRepository;
import com.xcale.challenge.service.impl.GroupServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = {WhAppController.class})
public class WhAppControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    IContactsRepository contactsRepository;

    @MockBean
    GroupServiceImpl groupService;

    @BeforeEach
    private void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void GIVEN_a_valid_request_WHEN_endpoint_called_THEN_success() throws Exception {

        GroupRequestDTO request = new GroupRequestDTO();
        String jsonRequest = "{}";

        Mockito.when(groupService.process(anyString(), eq(request)))
                .thenReturn(GroupResponseDTO.builder().build());

        mockMvc
                .perform(
                        post("/groups")
                                .param("group_id", "1")
                                .content(jsonRequest)
                                .contentType(MediaType.APPLICATION_JSON)
                ).andExpect(status().is(200));
    }

    @Test
    public void GIVEN_a_invalid_request_WHEN_endpoint_called_THEN_fail() throws Exception {

        GroupRequestDTO request = new GroupRequestDTO();
        String jsonRequest = "{}";

        Mockito.when(groupService.process(anyString(), eq(request)))
                .thenReturn(GroupResponseDTO.builder().build());

        mockMvc
                .perform(
                        post("/groups")
                                .content(jsonRequest)
                                .contentType(MediaType.APPLICATION_JSON)
                ).andExpect(status().is(200));
    }
}
