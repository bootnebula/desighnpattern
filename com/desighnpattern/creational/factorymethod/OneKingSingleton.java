package com.desighnpattern.creational.factorymethod;

public final class OneKingSingleton {

    public static OneKingSingleton king;

    private OneKingSingleton(){

    }

    public static synchronized OneKingSingleton getKing() {
        if (king==null){
            king=new OneKingSingleton();
        }else {
            king = king;
        }
        return king;
    }
}
