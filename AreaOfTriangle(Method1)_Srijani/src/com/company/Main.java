package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the base and height of a triangle: ");
        float b=S.nextFloat();
        float h=S.nextFloat();
        float area=(b*h)/2;
        System.out.println("The area is: "+area);

    }
}
