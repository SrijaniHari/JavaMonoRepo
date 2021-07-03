package com.company;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println("Enter the value of n:");
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int i;
//        for(i=1; i<=10; i++){
//            System.out.println("n"+"*"+"i"+"="+(n*i));
//        }

//        System.out.println("Enter the value of n:");
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int i,sum=0;
//        for(i=1; i<=n; i++)
//            sum=sum+i;
//        System.out.println("Sum is: "+sum);

        System.out.println("Enter the value of n:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,fact=1;
        for(i=1; i<=n; i++)
            fact=fact*i;
        System.out.println("The factorial value of "+ n +" is "+fact);

    }
}
