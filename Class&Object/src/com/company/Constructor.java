package com.company;
import java.util.Scanner;

class Rectangle2{
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

    public Rectangle2(){
        length=1;
        breadth=1;
    }
    public Rectangle2(double l,double b){
        setLength(l);
        setBreadth(b);
    }
    public Rectangle2(double s){
        setBreadth(s);
        setLength(s);
    }

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

public class Constructor {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth:");
        Scanner s=new Scanner(System.in);
        double len=s.nextDouble();
        double brth=s.nextDouble();
//        Rectangle2 r = new Rectangle2();
        Rectangle2 r=new Rectangle2(len,brth);
//        Rectangle2 r = new Rectangle2(len);
        System.out.println("Area is: "+r.area());
        System.out.println("Perimeter is: "+r.perimeter());
        System.out.println(r.isSquare());
    }
}
