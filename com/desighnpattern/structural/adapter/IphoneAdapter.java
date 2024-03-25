package com.desighnpattern.structural.adapter;

public class IphoneAdapter implements Phone{

    private iphone iphone;

    IphoneAdapter(iphone iphone){
        this.iphone=iphone;
    }

    @Override
    public void charge(){
        System.out.println("Charging iphone");
        iphone.lightningPortOn(true);
    }
}
