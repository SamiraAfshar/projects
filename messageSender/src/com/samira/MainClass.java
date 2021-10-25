package com.samira;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter Message :");
        String message = reader.nextLine();




        System.out.println("Enter Message Type (1 | 2):");
        int type = reader.nextInt();



        if(type==1) {
            MessageSender sender = new EmailMessageSender();
            LongMessage longMessage = new LongMessage(sender);
            longMessage.sendLongMessage(message);
        } else if (type==2){
            MessageSender sender =new SmsMessageSender();
            ShortMessage shortMessage =new ShortMessage(sender);
            shortMessage.sendShortMessage(message);

        }



//        if(type==1){
//            MessageSender sender =new EmailMessageSender();
//            sender.sendMessage(message);
//
//        }else if (type==2){
//            MessageSender sender= new SmsMessageSender();
//            sender.sendMessage(message);




    }
}
