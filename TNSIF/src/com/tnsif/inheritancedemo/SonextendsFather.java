package com.tnsif.inheritancedemo;

public class SonextendsFather {
    String bike = "Java";

    void study() {
        System.out.println("Studying Java");
    }

    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.car);
        System.out.println(s.money);
        System.out.println(s.bike);
        s.study();
    }
}

// Child class
class Son extends SonextendsFather {
    String car = "BMW";
    String money = "2 Lakhs";

   
}