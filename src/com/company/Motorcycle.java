package com.company;

public class Motorcycle extends Vechicle {

    private boolean luggage;
    Engine engine;

    public Motorcycle(int weight, String coulor,boolean luggage, Engine engine) {
        super(weight, coulor);

        this.luggage = luggage;
        this.engine = engine;

    }
    public Motorcycle(){}
    public boolean getLuggage() {
        return luggage;
    }

    public void setLuggage(boolean luggage) {
        this.luggage = luggage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void openDoor() {
        System.out.println("Motorite nemaat vrati");
    }
    public String toString(){
        return "Motorot =(Tezinata e:"+ getWeight()+",Bojata e: "+getCoulor()+",Ima li bagaz: "+getLuggage()+","+getEngine()+")";
    }
}
