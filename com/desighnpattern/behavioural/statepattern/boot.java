package com.desighnpattern.behavioural.statepattern;

public class boot {

    public static void main(String[] args) {

        WaterVendingMachine machine = new WaterVendingMachine();

        System.out.println(machine);
        machine.insertCoin();
        machine.dispenseWater();

        System.out.println(machine);
        machine.insertCoin();
        machine.insertCoin();
        machine.dispenseWater();

        System.out.println(machine);

        machine.insertCoin();
        machine.dispenseWater();
        machine.dispenseWater();
        System.out.println(machine);

        machine.insertCoin();
        machine.dispenseWater();
        System.out.println(machine);

        machine.insertCoin();
        machine.dispenseWater();
        System.out.println(machine);

        machine.insertCoin();
        machine.dispenseWater();
        System.out.println(machine);
    }
}
