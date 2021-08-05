package com.company;
import java.util.Scanner;

public class MethodOverloading {
//    Calculating area:
//    static double area(double l, double b){
//        return l*b;
//    }
//    static double area(double r){
//        return Math.PI*r*r;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter the length and breadth of the rectangle:");
//        Scanner s=new Scanner(System.in);
//        double l=s.nextDouble();
//        double b=s.nextDouble();
//        System.out.println("The area of rectangle is: " + area(l,b));
//        System.out.println("Enter the radius of the circle:");
//        double r=s.nextInt();
//        System.out.println("The area of circle is: " + area(r));

//    Reverse a number & an array:
//    static int reverse(int n) {
//        int r = 0;
//        while (n != 0) {
//            int d = n % 10;
//            n = n / 10;
//            r = (r * 10) + d;
//        }
//        return r;
//    }
//    static void reverse(int A[],int n){
//        System.out.println("The reversed array is:");
//        for(int i=n-1; i>=0; i--){
//            System.out.println(A[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter a number:");
//        Scanner s=new Scanner(System.in);
//        int value=s.nextInt();
//        System.out.println(("Reversed number is: " + reverse(value)));
//        System.out.println("Enter the number of elements: ");
//        int n = s.nextInt();
//        int A[] = new int[50];
//        System.out.println("Enter the the array elements one by one: ");
//        for(int i=0;i<n;i++)
//        {
//            A[i] = s.nextInt();
//        }
//        reverse(A,n);
//    }

//    Validating name & age:
        static  boolean validate(String name){
            return name.matches("[a-zA-Z//s]+");
        }
        static boolean validate(int age){
            return age>=3 && age<=15;
        }

    public static void main(String[] args) {
        System.out.println("Enter a name:");
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        System.out.println(validate(name));
        System.out.println("Enter an age:");
        int age=s.nextInt();
        System.out.println(validate(age));

    }






    }

