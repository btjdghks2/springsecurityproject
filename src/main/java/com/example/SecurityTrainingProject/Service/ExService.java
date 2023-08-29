package com.example.SecurityTrainingProject.Service;

import com.example.SecurityTrainingProject.Repository.StartEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExService {

    private final StartEntityRepository startEntityRepository;


}
