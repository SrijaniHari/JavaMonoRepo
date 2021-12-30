package com.company;
class NegativeValueException extends Exception{
    public String toString() {
        return "Values cannot be negative";
    }
}
public class ThrowThrows {
    static int area(int l,int b) throws NegativeValueException{
        if(l<0 || b<0)
            throw new NegativeValueException();
        return l*b;
    }
    static void area2() throws NegativeValueException{
        System.out.println(area(-19,3));
    }
    public static void main(String[] args) {
        try{
            area2();
        }
        catch (NegativeValueException e){
            System.out.println(e);
        }
    }
}
