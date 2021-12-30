package com.company;

public class TryAndCatchBlock {
    public static void main(String[] args) {
//        Try And Catch Block:
//        int A[] = {30,20,40,10,0};
//        try{
////           int c = A[0]/A[4];
//            int c = A[0]/A[3];
//            System.out.println("Division is "+ c);
//            System.out.println(A[5]);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Denominator should not be 0");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Index is invalid");
//        }
//        System.out.println("Bye");

//        Nested Try and Catch Block:
        int A[] = {30,20,40,10,0};
        try{
//          int c = A[0]/A[4];
            int c = A[0]/A[3];
            System.out.println("Division is "+ c);
            try {
                System.out.println(A[5]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index is invalid");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Bye");
    }
}
