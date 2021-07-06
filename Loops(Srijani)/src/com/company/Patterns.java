package com.company;

public class Patterns {
    public static void main(String[] args) {
//        PATTERN-1:
//        for (int i = 1; i <= 5; i++) {
//            for(int j=1; j<=5; j++)
//                System.out.print(j+" ");
//            System.out.print("\n");
//        }

//        PATTERN-2:
//        for (int i = 1; i <= 5; i++) {
//            for(int j=1; j<=5; j++)
//                System.out.print(i+" ");
//            System.out.print("\n");
//        }

//        PATTERN-3:
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++)
//                System.out.print((i+j) + " ");
//            System.out.print("\n");
//        }

//        PATTERN-4:
//        int n=1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++)
//                System.out.printf("%02d ",n++);
//            System.out.print("\n");

//      PATTERN-5:
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i ; j++)
//                System.out.print(j + " ");
//            System.out.print("\n");
//        }

//      PATTERN-6:
//        int n=1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i ; j++)
//                System.out.printf("%02d ",n++);
//            System.out.print("\n");
//        }

//      PATTERN-7:
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i ; j++)
//                System.out.print("*" + " ");
//            System.out.print("\n");
//        }

//      PATTERN-8:
//        for (int i = 5; i>= 1; i--) {
//            for (int j = 1; j <= i; j++)
//                System.out.print(j + " ");
//            System.out.print("\n");
//        }

//      PATTERN-9:
//        for (int i = 1; i<=5; i++) {
//            for (int j = 1; j <= i; j++){
//                System.out.print(" ");
//            }
//            for (int k = 5; k >= i; k--){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        PATTERN-10:
//        for (int i = 1; i<=5; i++) {
//            for (int j = 5; j >= i; j--){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//      PATTERN-11:
//        for (int i = 1; i<=5; i++) {
//            for (int j = 1; j <= (5-i); j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2*i-1); k++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//      PATTERN-12:
        for (int i = 1; i<=10; i++) {
            if(i<=5) {
                for (int j = 1; j <= (5 - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
            }
            else{
                for (int j = 1; j <= (i - 5); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * (10 - i) - 1); k++) {
                    System.out.print("*");
                }

            }
            System.out.print("\n");
        }
    }
}
