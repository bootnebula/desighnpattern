package com.desighnpattern.behavioural.statepattern;

public class WaterWendingMachine {


    private  State state;

    private  State notPaidState;

    private  State paidState;


    private State emptyTank;

    private State nonEmptyTank;

    public State getEmptyTank() {
        return emptyTank;
    }

    public void setEmptyTank(State emptyTank) {
        this.emptyTank = emptyTank;
    }

    public State getNonEmptyTank() {
        return nonEmptyTank;
    }

    public void setNonEmptyTank(State nonEmptyTank) {
        this.nonEmptyTank = nonEmptyTank;
    }

    public State getNotPaidState() {
        return notPaidState;
    }

    public void setNotPaidState(State notPaidState) {
        this.notPaidState = notPaidState;
    }

    public State getPaidState() {
        return paidState;
    }

    public void setPaidState(State paidState) {
        this.paidState = paidState;
    }

    private Integer avaialbleLiters;

    private Boolean coinsAvailable;

    WaterWendingMachine(){
        avaialbleLiters=5;
        coinsAvailable=false;
        state=new NotPaidState(this);
        notPaidState = state;
        paidState = new PaidState(this);
        emptyTank = new EmptyTankState(this);
        nonEmptyTank = new NonEmptyTankState(this);
    }




    public void insertCoin() {
        state.insertCoin();
    }


    public void dispenseWater() {
        state.dispenseWater();
    }

    public Integer getAvaialbleLiters() {
        return avaialbleLiters;
    }

    public void setAvaialbleLiters(Integer avaialbleLiters) {
        this.avaialbleLiters = avaialbleLiters;
    }

    public Boolean getCoinsAvailable() {
        return coinsAvailable;
    }

    public void setCoinsAvailable(Boolean coinsAvailable) {
        this.coinsAvailable = coinsAvailable;
    }



    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void ejectCoin() {
        System.out.println("Ejecting coin");
    }
}
