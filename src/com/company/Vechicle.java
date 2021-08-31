package com.company;

public class Vechicle {
    private int weight;
    private String coulor;

    public Vechicle(int weight, String coulor) {

        this.weight = weight;
        this.coulor = coulor;
    }
    public Vechicle(){}
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCoulor() {
        return coulor;
    }

    public void setCoulor(String coulor) {
        this.coulor = coulor;
    }


    public void startEngine(){

    }
    public void openDoor(){

    }
}