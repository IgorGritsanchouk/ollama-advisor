package com.mm.ollama.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.QuestionAnswerAdvisor;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class RegOllamaChatController {

//    private static final Logger log = LoggerFactory.getLogger(RegOllamaChatController.class);
//    private final ChatClient chatClient;
//
//    public RegOllamaChatController(@Qualifier("regOllamaChatClient") ChatClient chatClient) {
//        this.chatClient = chatClient;
//    }
//
//    @GetMapping("/")
//    public String chat() {
//        log.info("ollama controller chat: How did the Federal...? ");
//
//        String content= chatClient.prompt()
//                .user("How did the Federal Reserve's recent interest rate cut impact various asset classes according to the analysis")
//                .call()
//                .content();
//        log.info("Obtained content from LLM: "+ content);
//
//        return content;
//    }

}
