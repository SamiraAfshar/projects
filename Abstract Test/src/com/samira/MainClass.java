package com.samira;

public class MainClass {
    public static void main(String[] args) {

    IA ia1=new IA() {
        @Override
        public void showMessage(String message) {
            System.out.println("MainClass.showMessage : "+message);

        }
    };

    IA ia2=new A();
    IA ia3=new B();

    ia1.showMessage("mehdi");
    ia2.showMessage("reza");
    ia3.showMessage("ahmad");

        System.out.println(((A)ia2).sum(20,40));
        System.out.println(((B)ia3).mul(2,5));

    }
}
