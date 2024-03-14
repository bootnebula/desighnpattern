package com.desighnpattern.behavioural.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockSubject{

    Integer price;
    Boolean isChanged=false;

    List<StockObesever> stockObeseverList = new ArrayList<>();



    public void setPrice(Integer price) {
        this.price = price;
        isChanged=true;
        notifyChange();
    }
    public Boolean getIsChanged(){
        return isChanged;
    }


    @Override
    public boolean register(StockObesever stockObesever) {
        boolean flag= false;
        if(!stockObeseverList.contains(stockObesever)){
            stockObeseverList.add(stockObesever);
        }
        return flag;
    }

    @Override
    public boolean remove(StockObesever stockObesever) {
        boolean flag= false;
        if(stockObeseverList.contains(stockObesever)){
            stockObeseverList.remove(stockObesever);
            flag = true;
        }
        return flag;
    }

    @Override
    public void notifyChange() {
        if(this.isChanged){
            for (StockObesever so:stockObeseverList
                 ) {
                so.update(this.price);
            }
            this.isChanged=false;
        }

    }
}
