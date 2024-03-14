package com.desighnpattern.behavioural.observerpattern;

public interface StockSubject {

    public boolean register(StockObesever stockObesever);
    public boolean remove(StockObesever stockObesever);
    public void notifyChange();
}
