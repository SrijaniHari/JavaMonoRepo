package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Enter the number:");
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        if(n%2==0)
//            System.out.println("The number is positive");
//        else
//            System.out.println("The number is negative");

//        System.out.println("Enter your age: ");
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        if(n>=14 && n<=55)
//            System.out.println("You are young");
//        else
//            System.out.println("You are not young");

        System.out.println("Enter the marks of three subjects: ");
        Scanner s=new Scanner(System.in);
        int m1=s.nextInt();
        int m2=s.nextInt();
        int m3=s.nextInt();
        float avg=(float)(m1+m2+m3)/3;
        if(avg>=70)
            System.out.println("The grade is A");
        else if(avg>=60 && avg<70)
            System.out.println("The grade is B");
        else if(avg>=50 && avg<60)
            System.out.println("The grade is C");
        else if(avg>=40 && avg<50)
            System.out.println("The grade is D");
        else
            System.out.println("The grade is F");

    }
}
