package com.company;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(3, 345);
        Engine engine2 = new Engine(2,35);

        Truck truck = new Truck(8, "Red", 22, engine1);
        System.out.println(truck.toString());

        Car car = new Car(56,"blue",2,engine1);
        System.out.println(car.toString());

        Motorcycle motorcycle=new Motorcycle(345,"black",true,engine2);
        System.out.println(motorcycle.toString());


    }
}
