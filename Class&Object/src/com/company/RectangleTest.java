package com.company;
import java.util.Scanner;

class Rectangle{
    public double length;
    public double breadth;

    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }
    public boolean isSquare(){
        if (length==breadth)
            return true;
        else
            return false;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth:");
        Rectangle r1=new Rectangle();
        Scanner s=new Scanner(System.in);
        r1.length=s.nextDouble();
        r1.breadth=s.nextDouble();
        System.out.println("Area is: "+r1.area());
        System.out.println("Perimeter is: "+r1.perimeter());
        System.out.println(r1.isSquare());

    }
}
