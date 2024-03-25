package com.desighnpattern.structural.adapter;

public class SamsungAdapter implements Phone{
    private samsung samsung;

    SamsungAdapter(samsung s){
        this.samsung= s;
    }
    @Override
    public void charge(){
        System.out.println("Charging samsung");
        samsung.usbthreeportOn(true);
    }
}
