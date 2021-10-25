package com.samira;

public class ShortMessage {
    MessageSender smsMessageSender;

    public ShortMessage(MessageSender smsMessageSender) {
        this.smsMessageSender = smsMessageSender;
    }

    public void sendShortMessage(String m){
        if (m.length()<20){
            smsMessageSender.sendMessage(m);
        }else {
            System.out.println("Error");
        }

    }
}
