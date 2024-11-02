package com.test.aniket.test.controller;

import com.test.aniket.test.service.ComplaintService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/complaint")
@Slf4j
@RequiredArgsConstructor
@Tag(name = "Complaint")
public class ComplaintController {

    private final ComplaintService service;
}
