package com.company;

public class FinallyBlock {
    static int area(int l,int b) throws Exception{
        if(l<0 || b<0)
            throw new Exception();
        return l*b;
    }
    static void area2() throws Exception{
        System.out.println(area(-19,3));
    }
    public static void main(String[] args) throws Exception {
        try{
            area2();
        }
        finally{
            System.out.println("Hello");
        }
    }
}
