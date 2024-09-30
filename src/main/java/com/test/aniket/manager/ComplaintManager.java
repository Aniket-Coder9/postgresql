package com.test.aniket.manager;

import com.test.aniket.repository.ComplaintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ComplaintManager {

    private final ComplaintRepository complaintRepository;
}
