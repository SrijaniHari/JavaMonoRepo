package com.company;
import java.util.Scanner;

public class DisplayNumberInWords {
    static String getWordFromNumber(char c) {
        switch (c) {
            case '0': return "Zero";
            case '1': return "One";
            case '2': return "Two";
            case '3': return "Three";
            case '4': return "Four";
            case '5': return "Five";
            case '6': return "Six";
            case '7': return "Seven";
            case '8': return "Eight";
            case '9': return "Nine";
            default:  return "";
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        String str;
        char c;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            System.out.print(getWordFromNumber(c)+" ");

        }
    }
}
