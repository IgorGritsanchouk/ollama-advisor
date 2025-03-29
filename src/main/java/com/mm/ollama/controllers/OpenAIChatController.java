package com.mm.ollama.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class OpenAIChatController {

//    private static final Logger log = LoggerFactory.getLogger(OpenAIChatController.class);
//
//    private final ChatClient chatClient;
//
//    public OpenAIChatController(@Qualifier("openAIChatClient") ChatClient chatClient) {
//        this.chatClient = chatClient;
//    }
//
//    @GetMapping("/openai")
//    public String openai(@RequestParam String question) {
//
//        if (question != null && !question.isEmpty()) {
//            log.info("openai call. Param q is present: " + question);
//        } else {
//            question = "tell me interesting fact about openai?";
//            log.info("openai call default question: " + question);
//        }
//
//        return chatClient.prompt()
//                .user(question)
//                .call()
//                .content();
//    }
//
//    @GetMapping("/openai/joke")
//    public String joke() {
//        log.info("openai default joke");
//        return chatClient.prompt()
//                .user("Please tell me good dad joke about dogs in 2 sentences.")
//                .call()
//                .content();
//    }

}

