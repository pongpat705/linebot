package com.maoz.line.controllers;

import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import com.maoz.line.entity.LineLog;
import com.maoz.line.repository.LineLogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@LineMessageHandler
public class LineController {

    @Autowired
    private LineLogRepository lineLogRepository;

    @EventMapping
    public Message handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
        log.info("MessageEvent<TextMessageContent>: {}", event);
        final String originalMessageText = event.getMessage().getText();

        LineLog lineLog = new LineLog();
        lineLog.setCreatedDate(new Date());
        lineLog.setUserId(event.getSource().getUserId());
        lineLog.setMessageData(event.getMessage().getText());
        lineLogRepository.save(lineLog);

        return new TextMessage(originalMessageText);
    }

    @EventMapping
    public void handleDefaultMessageEvent(Event event) {
        log.info("event: {}", event);
        LineLog lineLog = new LineLog();
        lineLog.setCreatedDate(new Date());
        lineLog.setUserId(event.getSource().getUserId());
        lineLog.setMessageData("event");
        lineLogRepository.save(lineLog);

    }
}
