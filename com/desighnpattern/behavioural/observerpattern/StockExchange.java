package com.desighnpattern.behavioural.observerpattern;

public class StockExchange {


    public static void main(String[] args) {

        Stock reliance = new Stock();
        StockObesever up = new Upstox();
        StockObesever zd = new Zerodha();

        reliance.register(up);
        reliance.setPrice(10);
        reliance.register(zd);
        reliance.setPrice(12);
        reliance.remove(up);
        reliance.setPrice(13);
        reliance.remove(zd);
        reliance.setPrice(14);


    }
}
