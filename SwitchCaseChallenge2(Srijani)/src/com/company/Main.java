package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("______________");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");
        System.out.println("Enter two numbers:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("Enter your choice:");
        s.nextLine();
        String option=s.nextLine();
        switch(option){
            case "ADD": System.out.println(n1+n2);
                break;
            case "SUB": System.out.println(n1-n2);
                break;
            case "MUL": System.out.println(n1*n2);
                break;
            case "DIV": System.out.println(n1/n2);
                break;
        }


    }
}
