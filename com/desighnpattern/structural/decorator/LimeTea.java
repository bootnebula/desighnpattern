package com.desighnpattern.structural.decorator;

public class LimeTea extends Tea{
int cost=6;
Tea t;

LimeTea(Tea t){
    this.t=t;
}


    public int cost() {
        System.out.println("added Lime cost");
        return cost+t.cost();
    }
}
