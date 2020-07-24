package com.example.test;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MessageDemoTest {
    MessageDemo messageDemo;
    String message = "nihao";

    @Before
    public void setUp() throws Exception {
        messageDemo = new MessageDemo(this.message);
    }

    @Test
    public void printMessage() {
        message = "hello world";
        assertEquals(message,messageDemo.printMessage());
    }

    @Test
    public void sayHello() {
        System.out.println(messageDemo.sayHello("李四"));
    }
}
