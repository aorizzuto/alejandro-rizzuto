package com.xcale.challenge.controller;

import com.xcale.challenge.dto.GroupRequestDTO;
import com.xcale.challenge.dto.GroupResponseDTO;
import com.xcale.challenge.service.impl.GroupServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhAppController {

    GroupServiceImpl groupService;

    public WhAppController(GroupServiceImpl groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/groups/{group_id}")
    GroupResponseDTO getProducts(
            @RequestParam(name = "group_id") String groupId,
            @RequestBody GroupRequestDTO request
    ) throws Exception {
        groupService.validate(groupId, request);
        return groupService.process(groupId, request);
    }
}
