package com.maoz.line.controllers;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@LineMessageHandler
public class LineController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @EventMapping
    public Message handleTextMessage(MessageEvent<TextMessageContent> e) {
        log.info("event: " + e);
        TextMessageContent message = e.getMessage();
        return new TextMessage(message.getText());
    }
}
