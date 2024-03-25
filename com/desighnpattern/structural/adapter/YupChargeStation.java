package com.desighnpattern.structural.adapter;

public class YupChargeStation {

    public static void main(String[] args) {

        //charge via adapter
        iphone iphone=new iphone();
        Phone iphoneAdapter=new IphoneAdapter(iphone);
        iphoneAdapter.charge();
        samsung samsung = new samsung();
        Phone samsungAdapter=new SamsungAdapter(samsung);
        samsungAdapter.charge();

        //blutooth connect without adapter
        iphone.connectBluetooth();
        samsung.connectBluetooth();
    }
}
