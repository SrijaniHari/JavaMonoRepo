package com.company;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] arg) {
//    Display the digits of a number:
//        System.out.println("Enter a number:");
//        int d, n;
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        while (n != 0) {
//            d = n % 10;
//            n = n / 10;
//            System.out.println("Digits are: " + d);


//        Count digits of a number:
//        System.out.println("Enter a number:");
//        int d, n, c = 0;
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        while (n != 0) {
//            d = n % 10;
//            n = n / 10;
//            c++;
//        }
//        System.out.println("The number of digits is: " + c);

//        Armstrong Number:
//        System.out.println("Enter a number:");
//        int d, n, sum = 0;
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        int x=n;
//        while (n != 0) {
//            d = n % 10;
//            n = n / 10;
//            sum = sum + (d * d * d);
//        }
//        if(sum==x)
//            System.out.println("It's an ARMSTRONG number");
//        else
//            System.out.println("It's not an ARMSTRONG number");

//        Reversing of a number:
//        System.out.println("Enter a number:");
//        int d, n, r=0;
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        while (n != 0) {
//            d = n % 10;
//            n = n / 10;
//            r=(r*10)+d;
//        }
//        System.out.println("The reverse number is:"+r);

//        Palindrome Number:
        System.out.println("Enter a number:");
        int d, n, r=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int x=n;
        while (n != 0) {
            d = n % 10;
            n = n / 10;
            r = (r * 10) + d;
        }
        if(r==x)
            System.out.println("It's a PALINDROME number");
        else
            System.out.println("It's not a PALINDROME number");
    }
}

