package com.company;
import java.util.Scanner;
import java.io.FileInputStream;

public class TryWithResources {
//    static FileInputStream fi;
//    static Scanner sc;
    static void divide() throws Exception {
        try(FileInputStream fi = new FileInputStream("/Users/banib/IdeaProjects/Srijani(Java)/Text.txt");Scanner sc = new Scanner(fi)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
        }
//        try {
//            fi = new FileInputStream("/Users/banib/IdeaProjects/Srijani(Java)/Text.txt");
//            sc = new Scanner(fi);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//            System.out.println(a / c);
////            fi.close();
////            sc.close();
//        }
//        finally {
//            fi.close();
//            sc.close();
//        }

    }

    public static void main(String[] args) {
        try{
            divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
//        int x = sc.nextInt();
//        System.out.println(x);
    }
}
