package com.desighnpattern.behavioural.statepattern;

public class PaidState implements State{


    WaterWendingMachine machine;



    PaidState(){

    }
    PaidState(WaterWendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Already paid , ejecting coin , please collect water");
        machine.ejectCoin();
    }

    @Override
    public void dispenseWater() {
        if(machine.getAvaialbleLiters()>0) {
            machine.setState(machine.getNonEmptyTank());
            machine.dispenseWater();
        }else{
            machine.setState(machine.getEmptyTank());
            machine.dispenseWater();
        }
    }


    public WaterWendingMachine getMachine() {
        return machine;
    }

    public void setMachine(WaterWendingMachine machine) {
        this.machine = machine;
    }
}
