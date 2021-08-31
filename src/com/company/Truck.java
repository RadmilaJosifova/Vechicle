package com.company;

public class Truck extends Vechicle {

    private int towingCapasity;
    Engine engine;

    public Truck(int weight, String coulor, int towingCapasity, Engine engine) {
        super(weight, coulor);
        this.towingCapasity = towingCapasity;
        this.engine = engine;

    }

    public Truck(){}

    public int getTowingCapasity() {
        return towingCapasity;
    }

    public void setTowingCapasity(int towingCapasity) {
        this.towingCapasity = towingCapasity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String toString() {
        return "Truck =(Tezinata e: " + getWeight() + ",Bojata e: " + getCoulor() + ",Kapacitet za vlecenje: "+ getTowingCapasity() + "," + getEngine() + ")";
    }
}
