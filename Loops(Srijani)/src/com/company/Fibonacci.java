package com.company;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//      Progarm to print AP series:
//        System.out.println("AP SERIES");
//        System.out.println("Enter the first term:");
//        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//        System.out.println("Enter the difference:");
//        int d=s.nextInt();
//        System.out.println("Enter the no. of terms you want:");
//        int n=s.nextInt();
//        for(int i=1; i<n; i++){
//            System.out.print(a+",");
//            a=a+d;
//        }
//        System.out.println(a);

//        Program to print GP series:
//        System.out.println("GP SERIES");
//        System.out.println("Enter the first term:");
//        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//        System.out.println("Enter the difference:");
//        int d=s.nextInt();
//        System.out.println("Enter the no. of terms you want:");
//        int n=s.nextInt();
//        for(int i=1; i<n; i++) {
//            System.out.print(a + ",");
//            a = a * d;
//        }
//        System.out.println(a);

//        Fibonacci Series:
        System.out.println("FIBONACCI SERIES");
        System.out.println("Enter the no. of terms you want:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f1=0,f2=1,f3;

        System.out.print(f1+","+f2);
        for(int i=0; i<=n; i++){
            f3=f1+f2;
            System.out.print(","+f3);
            f1=f2;
            f2=f3;
        }
    }
}
