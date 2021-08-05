package com.company;
import java.util.Scanner;

class Rectangle {
    public int length;
    public int breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
class Cuboid extends Rectangle{
    public int height;
    public Cuboid(){
        height=1;
    }
    public Cuboid(int height){
        this.height=height;
    }
    public Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    public int volume(){
        return length*breadth*height;
    }
}
class Parent{
    public Parent(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Class");
    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Grand Child Class");
    }
}

public class ParamAndNonParamConstr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
        int l = s.nextInt();
        System.out.println("Enter the breadth:");
        int b = s.nextInt();
        System.out.println("Enter the height:");
        int h = s.nextInt();
//      Cuboid c = new Cuboid();
//      Cuboid c = new Cuboid(h);
        Cuboid c = new Cuboid(l,b,h);
        System.out.println("Volume is: "+c.volume());

        Parent p = new Parent();
        Child c1 = new Child();
        GrandChild g = new GrandChild();

    }
}
