package com.company;
import java.util.Scanner;


public class VariableArgument {
//    Finding maximum element:
//      static int max(int n, int... A) {
//        int max = A[0];
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] >= max) {
//                max = A[i];
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        int n = s.nextInt();
//        if (n == 0)
//            System.out.println("Array is empty");
//        else {
//            int A[] = new int[50];
//            System.out.println("Enter the the array elements one by one: ");
//            for (int i = 0; i < n; i++) {
//                A[i] = s.nextInt();
//            }
//            System.out.println("The maximum element of the array is " + max(n, A));
//        }
//    }

//     Sum of all elements:
//            static int sum(int ...A){
//                int s = 0;
//            for(int i=0;i<A.length;i++)
//                s = s + A[i];
//                return s;
//            }
//
//        public static void main(String[] args) {
//        System.out.println("The sum of numbers is " + sum());
//        System.out.println("The sum of numbers is " + sum(12,45,3,454,55,75));
//        System.out.println("The sum of numbers is " + sum(10,56,43,32,40,600,4456));
//    }

//    Calculating discount:
        static double discount(double ...A){
            double sum = 0;
            for(int i=0;i<A.length;i++)
                sum = sum + A[i];
            if(sum<500)
                return (sum*0.10);
            else if(sum>=500 && sum<1000)
                return (sum*0.15);
            else
                return (sum*0.20);
        }

    public static void main(String[] args) {
        System.out.println("The discounted amount is " + discount(12,45,3,454,55,75));
        System.out.println("The discounted amount is " + discount(10,56,43,32,40,600,4456));
    }
}