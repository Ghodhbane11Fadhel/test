package com.example.demo.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
@RequiredArgsConstructor

public class ApiControler {

private ApiService apiService;
@GetMapping("/api")
    public void controler(){
    this.apiService.getmekla();
}



}
