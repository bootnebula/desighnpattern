package com.desighnpattern.structural.flyweight;

public class Mutable implements Cloneable{

    private String immutableProperty;

    public Mutable(String immutableProperty){
        this.immutableProperty=immutableProperty;
    }

    public String getImmutableProperty() {
        return immutableProperty;
    }

    public void setImmutableProperty(String immutableProperty) {
        this.immutableProperty=immutableProperty;
    }


    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Mutable{" +
                "immutableProperty='" + immutableProperty + '\'' +
                '}';
    }
}
