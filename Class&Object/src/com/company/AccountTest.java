package com.company;
import java.util.Scanner;

class Account{
    private String name;
    private long accountNo;
    private double accountBalance;

    public void setName(String n) { name=n; }
    public String getName() { return name; }
    public void setAccountNo(long acNo) { accountNo = acNo; }
    public long getAccountNo() { return accountNo; }
    public void setAccountBalance(double acBal) { accountBalance = acBal; }
    public double getAccountBalance() { return accountBalance; }
    public double deposit(double amt1)
    {
        return accountBalance + amt1;
    }
    public double withdraw(double amt2)
    {
        return accountBalance - amt2;
    }
    public String toString() {
        return "\n" + "Name : " + getName() + "\n" + "Account Number : " + getAccountNo() + "\n" + "Account Balance : " + getAccountBalance() + "\n";
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account holder name: ");
        ac.setName(s.nextLine());
        System.out.println("Enter the account number: ");
        ac.setAccountNo(s.nextLong());
        s.nextLine();
        System.out.println("Enter the account balance: ");
        ac.setAccountBalance(s.nextDouble());
        s.nextLine();
        System.out.println("Enter the amount you want to deposit: ");
        double amount1 = s.nextDouble();
        s.nextLine();
        System.out.println("Enter the amount you want to withdraw: ");
        double amount2 = s.nextDouble();
//        System.out.println("Name : " + ac.getName());
//        System.out.println("Account Number : " + ac.getAccountNo());
//        System.out.println("Account balance : " + ac.getAccountBalance());
        System.out.println("Details : " + ac);
        System.out.println("The amount after depositing the amount : " + ac.deposit(amount1));
        System.out.println("The amount after withdraw the amount : " + ac.withdraw(amount2));
    }
}
