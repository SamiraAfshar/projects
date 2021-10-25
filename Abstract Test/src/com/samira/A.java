package com.samira;

public class A implements IA{
    @Override
    public void showMessage(String message) {
        System.out.println("A.showMessage :"+message);
    }

    public int sum(int a,int b){
        return a+b;
    }
}
