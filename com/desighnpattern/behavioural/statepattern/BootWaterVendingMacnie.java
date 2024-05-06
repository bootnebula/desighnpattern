package com.desighnpattern.behavioural.statepattern;

public class BootWaterVendingMacnie
{
    public static void main(String[] args) {

        WaterWendingMachine wm=new WaterWendingMachine();

        wm.insertCoin();
        wm.dispenseWater();


        wm.insertCoin();
        wm.dispenseWater();


        wm.insertCoin();
        wm.insertCoin();
        wm.dispenseWater();


        wm.insertCoin();
        wm.dispenseWater();
        wm.dispenseWater();



        wm.insertCoin();
        wm.dispenseWater();

        wm.insertCoin();
        wm.dispenseWater();


        wm.dispenseWater();
        wm.dispenseWater();
        wm.insertCoin();
        wm.dispenseWater();


        wm.insertCoin();
        wm.insertCoin();

    }
}
