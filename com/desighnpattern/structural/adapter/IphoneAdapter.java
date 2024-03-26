package com.desighnpattern.structural.adapter;

public class IphoneAdapter implements Device{

    private iphone iphone;

    IphoneAdapter(iphone iphone){
        this.iphone=iphone;
    }

    @Override
    public void charge(){
        System.out.println("Charging iphone");
        iphone.lightningCharge(true);
    }
}
