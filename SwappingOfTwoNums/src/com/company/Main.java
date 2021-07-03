package com.company;

public class Main {

    public static void main(String[] args) {
	int a=0b1001;
	int b=0b1100;
	a=(a^b);
	b=(a^b);
	a=(a^b);
	System.out.println(a);
	System.out.println(b);
    }
}
