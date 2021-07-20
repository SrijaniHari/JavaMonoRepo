package com.company;
import java.util.Scanner;

class Circle{
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Circle c1=new Circle();
        Scanner s=new Scanner(System.in);
        c1.radius=s.nextDouble();
        System.out.println("Area is: "+c1.area());
        System.out.println("Perimeter is: "+c1.perimeter());
        System.out.println("Circumference is: "+c1.circumference());
    }
}
