package com.company;

class Super{
    public void display(){
        System.out.println("Super class display");
    }
}

class Sub extends Super{
//      public void display(int x){
        public void display(){
        System.out.println("Sub class display");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Super su = new Super();
        su.display();
        Sub s = new Sub();
//      s.display(4);
        s.display();
    }
}
