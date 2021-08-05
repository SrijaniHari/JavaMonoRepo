package com.company;
import java.util.Scanner;

public class PrimeNumber {
//    Prime Number:
//    static boolean isPrime(int n){
//        for(int i=2; i<=n/2; i++) {
//            if(n%i==0)
//                return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//       System.out.println("Enter a number:");
//       Scanner s=new Scanner(System.in);
//       System.out.println(isPrime(s.nextInt()));

//    GCD of numbers:
//    static int gcd(int m, int n) {
//        while (n!=m) {
//            if (n > m)
//                n=n-m;
//            else
//                m=m-n;
//        }
//        return m;
//    }
//
//    public static void main(String[] args) {
//       System.out.println("Enter two numbers:");
//       Scanner s=new Scanner(System.in);
//       int value1=s.nextInt();
//       int value2=s.nextInt();
//       System.out.println("The GCD of two numbers is: " + gcd(value1,value2));

//    Max Number:
    static int maxElement(int A[],int n) {
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] >= max)
                max = A[i];
        }
        return max;
    }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of elements: ");
            int n = s.nextInt();
            int A[] = new int[50];
            System.out.println("Enter the the array elements one by one: ");
            for(int i=0;i<n;i++)
            {
                A[i] = s.nextInt();
            }
            System.out.println("The maximum element of the array is " + maxElement(A,n));
        }

    }

