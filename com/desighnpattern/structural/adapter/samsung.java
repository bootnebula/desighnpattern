package com.desighnpattern.structural.adapter;

public class samsung
{
    private Boolean usbthreeport=true;
    private boolean bluetooth;

    public Boolean usbthreeportOn(Boolean value){
        this.usbthreeport=value;
        return usbthreeport;
    }

    public void connectBluetooth(){
        System.out.println("samsung bluetooth");
        this.bluetooth=true;
    }
}
