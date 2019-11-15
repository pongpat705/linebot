package com.maoz.line.controllers;

import com.maoz.line.entity.LineLog;
import com.maoz.line.repository.LineLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private LineLogRepository lineLogRepository;

    @GetMapping(value = "/test")
    public void test(){
        LineLog lineLog = new LineLog();
        lineLog.setCreatedDate(new Date());
        lineLog.setUserId("xxxx");
        lineLog.setMessageData("event");
        lineLogRepository.save(lineLog);
    }
}
