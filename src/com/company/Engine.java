package com.company;
public class Engine {
    private int displacement;
    private int horsepower;

    public Engine(int displacement, int horsepower) {
        this.displacement = displacement;
        this.horsepower = horsepower;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }


    public String toString(){
        return "Engine =("+getDisplacement()+","+getHorsepower()+")";
    }
}
