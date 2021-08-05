package com.company;

class Car{
    public void start(){
        System.out.println("Car is started");
    }
    public void accelerate(){
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Gear is changed manually");
    }
}

class LuxuryCar extends Car{
    public void changeGear(){
        System.out.println("Gear is changed automatically");
    }
    public void openRoof(){
        System.out.println("Car roof is open");
    }

}
public class CarAndLuxuryCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.changeGear();
        c.accelerate();
        c.start();

        LuxuryCar l = new LuxuryCar();
        l.changeGear();
        l.start();
        l.accelerate();
        l.openRoof();
    }
}
