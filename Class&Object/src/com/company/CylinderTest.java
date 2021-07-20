package com.company;
import java.util.Scanner;

class Cylinder{
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
    public double totalSurfaceArea(){
        return 2 * lidArea() + circumference() * height;
    }
    public double volume(){
        return lidArea() * height;
    }
}

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c= new Cylinder();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius and height of the cylinder : ");
        c.radius = s.nextDouble();
        c.height = s.nextDouble();
        System.out.println("The lid area of the cylinder is "+c.lidArea());
        System.out.println("The circumference of the cylinder is "+c.circumference());
        System.out.println("The total surface area of the cylinder is "+c.totalSurfaceArea());
        System.out.println("The volume of the cylinder is "+c.volume());
    }
}
