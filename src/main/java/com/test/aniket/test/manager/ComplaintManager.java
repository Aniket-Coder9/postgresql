package com.test.aniket.test.manager;

import com.test.aniket.test.repository.ComplaintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ComplaintManager {

    private final ComplaintRepository complaintRepository;
}
