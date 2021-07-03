package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Enter a number:");
//        Scanner s=new Scanner(System.in);
//        String str=s.nextLine();
//        if(str.matches("[01]+"))
//            System.out.println("Binary Radix=2");
//        else if(str.matches("[0-7]+"))
//            System.out.println("Octal Radix=8");
//        else if(str.matches("[0-9A-F]+"))
//            System.out.println("Hexadecimal Radix=16");
//        else if(str.matches("[0-9]+"))
//            System.out.println("Decimal Radix=10");
//        else
//            System.out.println("The number is invalid");

        System.out.println("Enter a year:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%4==0 && (n%100!=0 || n%400==0))
            System.out.println("It's a leap year");
        else
            System.out.println("It's not a leap year");
    }
}
