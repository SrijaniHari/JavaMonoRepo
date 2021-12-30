package com.company;
class ATM{
    synchronized public void checkBalance(String name) {
        System.out.println(name + " Checking balance");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }
    synchronized public void withdraw(String name,int amount){
        System.out.println(name+ " is withdrawing "+amount);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }
}
class Customer extends Thread{
    String name;
    int amount;
    ATM atm;

    public Customer(String n,ATM a,int amo){
        name=n;
        amount=amo;
        atm=a;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}
public class ATMMachine {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        c1.start();
        c2.start();
    }
}
