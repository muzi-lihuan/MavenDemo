package com.example.test;

public class MessageDemo {
    private String message;

    public MessageDemo (String message) {
        this.message = message;
    }

    public String printMessage () {
        return  message;
    }

    public String sayHello (String name) {
        return  "hello " + name + message;
    }
}
