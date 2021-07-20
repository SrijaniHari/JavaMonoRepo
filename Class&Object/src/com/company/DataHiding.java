package com.company;
import java.util.Scanner;

class Rectangle1{
    private double length;
    private double breadth;

    public void setLength(double l) {
        if(l>0)
            length=l;
        else
            System.out.println("Invalid input");
    }
    public double getLength() { return length; }
    public void setBreadth(double b) {
        if(b>0)
            breadth=b;
        else
            System.out.println("Invalid input");
    }
    public double getBreadth() { return breadth; }
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

public class DataHiding {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth:");
        Rectangle1 r=new Rectangle1();
        Scanner s=new Scanner(System.in);
        r.setLength(s.nextDouble());
        r.setBreadth(s.nextDouble());
        System.out.println("Area is: "+r.area());
        System.out.println("Perimeter is: "+r.perimeter());
        System.out.println(r.isSquare());
    }
}
