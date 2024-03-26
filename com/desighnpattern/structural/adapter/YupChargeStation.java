package com.desighnpattern.structural.adapter;

public class YupChargeStation {

    public static void main(String[] args) {

        //charge via adapter
        iphone iphone=new iphone();
        IphoneAdapter iphoneAdapter=new IphoneAdapter(iphone);
        iphoneAdapter.charge();
        samsung samsung = new samsung();
        SamsungAdapter samsungAdapter=new SamsungAdapter(samsung);
        samsungAdapter.charge();

        //blutooth connect without adapter
        iphone.connectBluetooth();
        samsung.connectBluetooth();
    }
}
