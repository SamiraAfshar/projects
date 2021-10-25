package com.samira;

public class SmsMessageSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SmsMessageSender.sendMessage:"+ message);
    }
}
