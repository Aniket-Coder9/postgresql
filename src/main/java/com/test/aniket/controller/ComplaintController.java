package com.test.aniket.controller;

import com.test.aniket.service.ComplaintService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/complaint")
@Slf4j
@RequiredArgsConstructor
public class ComplaintController {

    private final ComplaintService service;
}
