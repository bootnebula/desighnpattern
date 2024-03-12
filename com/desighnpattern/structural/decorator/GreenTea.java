package com.desighnpattern.structural.decorator;

public class GreenTea extends Tea{
    int cost=6;
    Tea t;

    GreenTea(Tea t){
        this.t=t;
    }


    public int cost() {
        System.out.println("added Green cost");
        return cost+t.cost();
    }
}