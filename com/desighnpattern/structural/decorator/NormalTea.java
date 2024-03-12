package com.desighnpattern.structural.decorator;

public class NormalTea  extends Tea{



    public int cost() {
        System.out.println("Tea cost");
        return 10;
    }
}