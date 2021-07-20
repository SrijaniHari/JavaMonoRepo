package com.company;
import java.util.Scanner;

class Cylinder1 {
    private double radius;
    private double height;

    public void setRadius(double r) {
        if (r > 0)
            radius = r;
        else
            System.out.println("Invalid input");
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double h) {
        if (h > 0)
            height = h;
        else
            System.out.println("Invalid input");
    }

    public double getHeight() {
        return height;
    }

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }

    public double volume() {
        return lidArea() * height;
    }

    public Cylinder1(){
        radius=1;
        height=1;
    }
    public Cylinder1(double r, double h){
        setRadius(r);
        setHeight(h);
    }
    public Cylinder1(double d){
        setRadius(d);
        setHeight(d);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius and height of the cylinder : ");
        double rad = s.nextDouble();
        double hght = s.nextDouble();
//        Cylinder1 c = new Cylinder1();
        Cylinder1 c= new Cylinder1(rad,hght);
//        Cylinder1 c = new Cylinder1(rad);
        System.out.println("The lid area of the cylinder is "+c.lidArea());
        System.out.println("The circumference of the cylinder is "+c.circumference());
        System.out.println("The total surface area of the cylinder is "+c.totalSurfaceArea());
        System.out.println("The volume of the cylinder is "+c.volume());
    }
}
