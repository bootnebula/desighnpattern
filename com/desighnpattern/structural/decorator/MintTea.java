package com.desighnpattern.structural.decorator;

public class MintTea extends Tea{
    int cost=6;
    Tea t;

    MintTea(Tea t){
        this.t=t;
    }


    public int cost() {
        System.out.println("added Mint cost");
        return cost+t.cost();
    }
}