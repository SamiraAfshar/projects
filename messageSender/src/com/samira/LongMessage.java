package com.samira;

public class LongMessage {
    MessageSender emailMessageSender;

    public LongMessage(MessageSender emailMessageSender) {
        this.emailMessageSender = emailMessageSender;
    }

    public void sendLongMessage(String m){
        m="*"+m+"#";
        emailMessageSender.sendMessage(m);
    }
}
