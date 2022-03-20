package com.xcale.challenge.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xcale.challenge.dto.GroupRequestDTO;
import com.xcale.challenge.dto.GroupResponseDTO;

public interface IGroupService {

    void validate(String id, GroupRequestDTO request) throws Exception;

    GroupResponseDTO process(String id, GroupRequestDTO request) throws JsonProcessingException;
}
