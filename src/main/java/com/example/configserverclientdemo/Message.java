package com.example.configserverclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class Message {

    @Value("${ConfigServerDemo.fromvault}")
    String name = "World";

    public String get() {
        return name;
    }
}
