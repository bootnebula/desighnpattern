package com.desighnpattern.creational;

public class OneKingSingleton {

    private static volatile OneKingSingleton king;

    private OneKingSingleton(){

    }

    public static  OneKingSingleton getKing() {
        if (king==null){
            synchronized (OneKingSingleton.class) {
                if (king==null) {
                    king = new OneKingSingleton();
                }
            }
        }else {
            king = king;
        }
        return king;
    }
}
