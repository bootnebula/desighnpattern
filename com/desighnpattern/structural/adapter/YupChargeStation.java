package com.desighnpattern.structural.adapter;

public class YupChargeStation {

    public static void main(String[] args) {
        iphone iphone=new iphone();
        IphoneAdapter iphoneAdapter=new IphoneAdapter(iphone);
        iphoneAdapter.charge();

        SamsungAdapter samsungAdapter=new SamsungAdapter(new samsung());
        samsungAdapter.charge();
    }
}
