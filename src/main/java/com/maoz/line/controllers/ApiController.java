package com.maoz.line.controllers;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Map<String, Object> get(HttpServletRequest request, HttpServletResponse response){
        log.info("called by ip {}",request.getRemoteAddr());
        Map<String, Object> result = new HashMap<>();
        result.put("status", "OK");

        return result;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Map<String, Object> index(HttpServletRequest request, HttpServletResponse response, @RequestBody String object){
        log.info("called by ip {}",request.getRemoteAddr());
        log.info("object input {}",object);
        Map<String, Object> result = new HashMap<>();
        result.put("status", "OK");

        return result;
    }



}
