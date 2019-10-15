package com.maoz.line.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {


    @RequestMapping(value = "/")
    public Map<String, Object> index(){
        Map<String, Object> result = new HashMap<>();
        result.put("status", "OK");

        return result;
    }
}
