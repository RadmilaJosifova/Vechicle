package com.company;

public class Car extends Vechicle {

    private int passengerCapasity;
    Engine engine;

    public Car(int weight, String coulor, int passengerCapasity, Engine engine) {
        super(weight, coulor);
        this.passengerCapasity = passengerCapasity;
        this.engine = engine;
    }
    public Car(){}

    public int getPassengerCapasity() {
        return passengerCapasity;
    }

    public void setPassengerCapasity(int passengerCapasity) {
        this.passengerCapasity = passengerCapasity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String toString() {
        return "Car =(Tezinata e: " + getWeight() + ",Bojata e: " + getCoulor() + ",Kapacitet na patnici: " + getPassengerCapasity() + "," + getEngine() + ")";
    }
}