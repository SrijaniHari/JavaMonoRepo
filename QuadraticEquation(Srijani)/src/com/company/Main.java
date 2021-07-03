package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the coefficients: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        double d,r1,r2;
        d=(b*b)-4*a*c;
        if(d>0){
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The real and unequal roots are: "+r1+" "+r2);
        }
        else if(d==0){
            r1=r2=-b/(2*a);
            System.out.println("The real and equal roots are: "+r1+" "+r2);
        }
        else
            System.out.println("The roots are imaginary");
    }
}
