package com.desighnpattern.behavioural.statepattern;

public class NonEmptyTankState implements State{


    WaterWendingMachine machine;



    NonEmptyTankState(){

    }
    NonEmptyTankState(WaterWendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {

        if(!machine.getCoinsAvailable())
        {
            machine.setCoinsAvailable(true);
            machine.setState(machine.getPaidState());
            machine.insertCoin();
        }else{
            System.out.println("Already paid");
            machine.ejectCoin();
        }
    }

    @Override
    public void dispenseWater() {
        if(machine.getAvaialbleLiters()>0) {
            System.out.println("please collect water");
            machine.setCoinsAvailable(false);
            machine.setState(machine.getNotPaidState());
            machine.setAvaialbleLiters(machine.getAvaialbleLiters()-1);
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
