package com.samira;

public class B implements IA {
    @Override
    public void showMessage(String message) {
        System.out.println("B.showMessage :"+message);
    }

    public int mul(int a,int b){
        return a*b;
    }
}
