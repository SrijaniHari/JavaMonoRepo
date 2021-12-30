package com.company;

import java.util.Scanner;

class StackOverflow extends Exception{
    public String toString(){
        return "Stack is OVERFLOW,You cannot put any other value";
    }
}
class StackUnderflow extends Exception{
    public String toString(){
        return "Stack is UNDERFLOW,Stack is empty";
    }
}

class Stack1{
    private int size;
    private int top=-1;
    private int s[];
    public Stack1(int size){
        this.size=size;
        s=new int[size];
    }
    public void push(int x) throws StackOverflow {
        if (top == size - 1)
            throw new StackOverflow();
        else{
            top++;
            s[top]=x;
        }
    }
    public int pop() throws StackUnderflow{
        if(top==-1)
            throw new StackUnderflow();
        else{
            int x;
            x=s[top];
            top--;
            return x;
        }
    }
}
public class Stack {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the stack size:");
        int n = s.nextInt();
        Stack1 s1=new Stack1(n);
        try{
            s1.push(12);
            s1.push(20);
            s1.push(34);
            s1.push(9);
            s1.push(4);
        }
        catch (StackOverflow e){
            System.out.println(e);
        }
    }
}
