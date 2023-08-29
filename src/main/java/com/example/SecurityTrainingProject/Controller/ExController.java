package com.example.SecurityTrainingProject.Controller;

import com.example.SecurityTrainingProject.Service.ExService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExController {

    private final ExService exService;

    @GetMapping("/")
    public String home(){
        return "";
    }
}
