package com.desighnpattern.structural.flyweight;

public class boot {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mutable m=new Mutable("No 1");
        Immutable im=new Immutable("Akhil",m);
        System.out.println(im);

        m.setImmutableProperty("no 2");
        System.out.println(im);
        im.getMutable().setImmutableProperty("no 3");
        System.out.println(im);
    }
}
