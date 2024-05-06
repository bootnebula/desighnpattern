package com.desighnpattern.behavioural.statepattern;

public class WaterVendingMachine {


    private Integer avaialbleLiters;

    private Integer coinsAvailable;

    private Boolean paid = false;



    public WaterVendingMachine(){
        this.avaialbleLiters=5;
        this.coinsAvailable=0;
    }

    public void insertCoin(){
        coinsAvailable+=1;
        if(!paid){
            System.out.println("Coin inserted");
            paid=true;
        }
        else{
            System.out.println("Coin alredy inserted");
            rejectCoin();
        }
    }

    private void rejectCoin() {
        coinsAvailable-=1;
        System.out.println("Coin rejected ,please collect it");
    }

    public void dispenseWater(){
        if (avaialbleLiters>0&&paid) {
            System.out.println("Dispensing Water...");
            avaialbleLiters-=1;
            paid=false;
        }else if (!paid){
            System.out.println("Not paid, please insert coin");
        }else{
            System.out.println("Tank Empty");
            if(paid){
                rejectCoin();
            }
        }
    }


    public void refillTank(Integer liters){
        System.out.println("refillin Water...");
        avaialbleLiters=liters;
    }

    public void collectMoney(){
        System.out.println("Collect Money...");
        coinsAvailable=0;
    }








    public Integer getAvaialbleLiters() {
        return avaialbleLiters;
    }

    public Integer getCoinsAvailable() {
        return coinsAvailable;
    }

    public void setAvaialbleLiters(Integer avaialbleLiters) {
        this.avaialbleLiters = avaialbleLiters;
    }

    public void setCoinsAvailable(Integer coinsAvailable) {
        this.coinsAvailable = coinsAvailable;
    }

    @Override
    public String toString() {
        return "Wending machine state Water :"+this.avaialbleLiters+" availble money :"+coinsAvailable;
    }
}
