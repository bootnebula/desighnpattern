package com.desighnpattern.structural.flyweight;

public final class Immutable {


    private final String name;
    private final Mutable mutable;


    public Immutable(String name, Mutable mutable){
        this.name=name;
       this.mutable=new Mutable(mutable.getImmutableProperty());
       // this.mutable=mutable;
    }
    public String getName() {
        return name;
    }

    public Mutable getMutable() throws CloneNotSupportedException {
        return (Mutable) mutable.clone();
    }



    @Override
    public String toString() {
        return "Immutable{" +
                "name='" + name + '\'' +
                ", mutable=" + mutable +
                '}';
    }
}
