package com.desighnpattern.behavioural.statepattern;

public class EmptyTankState implements State{


    WaterWendingMachine machine;



    EmptyTankState(){

    }
    EmptyTankState(WaterWendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("empty water!");
        machine.setState(machine.getEmptyTank());
        machine.ejectCoin();
        machine.setCoinsAvailable(false);
    }

    @Override
    public void dispenseWater() {
        System.out.println("empty water!");
        machine.setState(machine.getEmptyTank());
    }


    public WaterWendingMachine getMachine() {
        return machine;
    }

    public void setMachine(WaterWendingMachine machine) {
        this.machine = machine;
    }
}
