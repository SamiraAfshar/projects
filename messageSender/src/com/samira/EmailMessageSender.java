package com.samira;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("EmailMessageSender.sendMessage :"+message);
    }
}
