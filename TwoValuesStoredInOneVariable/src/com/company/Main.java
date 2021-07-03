package com.company;

public class Main {

    public static void main(String[] args) {
	byte a=0b0101;
	byte b=0b1001;
	byte c=(byte)(b<<4);
	c=(byte)(a|c);
	System.out.println((c&0b11110000)>>4);
	System.out.println(c&0b00001111);
    }
}
