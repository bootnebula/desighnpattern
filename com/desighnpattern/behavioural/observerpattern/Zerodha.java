package com.desighnpattern.behavioural.observerpattern;

public class Zerodha implements StockObesever , DisplayElement{

    int price;

    @Override
    public void update(int price) {
        this.price=price;
        display();
    }

    @Override
    public void display() {
        System.out.println("Zerodha shows price for stock"+this.price);
    }
}
