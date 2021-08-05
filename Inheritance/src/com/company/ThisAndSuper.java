package com.company;
import java.util.Scanner;

class Rectangle1 {
    public int length;
    public int breadth;
    int x=10;

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display(){
        System.out.println("Length of the rectangle is: "+this.length);
        System.out.println("Breadth of the rectangle is: "+this.breadth);
    }
}

class Cuboid1 extends Rectangle1{
    public int height;
    public int x=20;
    public Cuboid1(int l,int b,int h){
        super(l,b);
        height=h;
    }
    public int volume(){
        return length*breadth*height;
    }
    public void display(){
        System.out.println("Value of x variable of Parent class: " + super.x);
        System.out.println("Value of x variable of Child class: " + x);
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int l = s.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int b = s.nextInt();
        Rectangle1 r1= new Rectangle1(l,b);
        r1.display();
        System.out.println("Enter the length of the rectangle:");
        int l1 = s.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int b1 = s.nextInt();
        Rectangle1 r2= new Rectangle1(l1,b1);
        r2.display();
        System.out.println("Enter the height of the cuboid:");
        int h = s.nextInt();
        Cuboid1 c = new Cuboid1(l1,b1,h);
        System.out.println("Volume is: "+c.volume());
        c.display();
    }
}
