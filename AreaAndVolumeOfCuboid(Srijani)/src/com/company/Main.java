package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the height,breadth,length of a cuboid: ");
	int h=s.nextInt();
	int b=s.nextInt();
	int l=s.nextInt();
	int area=((2*l*h)+(2*b*h)+(2*l*b));
	int volume=l*h*b;
	System.out.println("The area and volume of the cuboid are:"+area+" "+volume);
    }
}
