package com.desighnpattern.behavioural.statepattern;

public class NotPaidState implements State{


    WaterWendingMachine machine;



    NotPaidState(){

    }
    NotPaidState(WaterWendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        if(!machine.getCoinsAvailable())
        {
            machine.setCoinsAvailable(true);
            machine.setState(machine.getPaidState());
        }else{
            System.out.println("Already paid");
            machine.ejectCoin();
        }


    }

    @Override
    public void dispenseWater() {
        System.out.println("please insert coin.");
    }


    public WaterWendingMachine getMachine() {
        return machine;
    }

    public void setMachine(WaterWendingMachine machine) {
        this.machine = machine;
    }
}
