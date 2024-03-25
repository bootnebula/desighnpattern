package com.desighnpattern.structural.adapter;

public class iphone{

    private Boolean lightningPort;

    private Boolean bluetooth;

    public Boolean lightningPortOn(Boolean value) {
         this.lightningPort=value;
         return lightningPort;
    }
    public void connectBluetooth(){
        System.out.println("iphone bluetooth");
        this.bluetooth=true;
    }
}
