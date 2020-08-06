package com.example.democicd.controller;

import com.example.democicd.service.Service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/backendA")
public class BackendAController {

    private final Service businessAService;

    public BackendAController(@Qualifier("backendAService") Service businessAService) {
        this.businessAService = businessAService;
    }

    @GetMapping("failure")
    public String failure() {
        return businessAService.failure();
    }

    @GetMapping("success")
    public String success() {
        return businessAService.success();
    }

    @GetMapping("successException")
    public String successException() {
        return businessAService.successException();
    }

    @GetMapping("ignore")
    public String ignore() {
        return businessAService.ignoreException();
    }
}
