package com.company;
import java.util.Scanner;

class Account {
    private long accNo;
    private String name;
    private String address;
    private String phnNo;
    private String dob;
    protected double balance;

    public long getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhnNo() { return phnNo; }
    public String getDob() { return dob; }
    public double getBalance() { return balance; }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public Account(long accountNo,String n,String add,String phNo,String dob1){
        accNo=accountNo;
        name=n;
        setAddress(add);
        setPhnNo(phNo);
        dob=dob1;
        balance=0;
    }
    public String toString(){
        return "\n Account Number: "+accNo+"\n Account Holder Name: "+name+"\n Account Holder Address: "+address+"\n Account Holder Phone Number: "+phnNo+"\n Acoount Holder DOB: "+dob;
    }
}
    class SavingsAccount extends Account{

        public SavingsAccount(long accountNo, String n, String add, String phNo, String dob1) {
            super(accountNo, n, add, phNo, dob1);
        }

        public void deposit(double amt){
            balance +=amt;
        }
        public void withdraw(double amt){
            balance -=amt;
        }
    }

    class LoanAccount extends Account{
        public LoanAccount(long accountNo, String n, String add, String phNo, String dob1) {
            super(accountNo, n, add, phNo, dob1);
        }

        public void payEmi(double amt){
            balance -=amt;
        }
        public void rePay (double amt){
                if(balance==amt)
                    balance = 0;
        }
    }

public class InheritanceAccount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        long acc = s.nextLong();
        s.nextLine();
        System.out.println("Enter the account holder name: ");
        String name = s.nextLine();
        System.out.println("Enter the account holder address: ");
        String add = s.nextLine();
        System.out.println("Enter the account holder phone number: ");
        String phNo = s.nextLine();
        System.out.println("Enter the account holder date of birth: ");
        String dob = s.nextLine();
        SavingsAccount sa = new SavingsAccount(acc,name,add,phNo,dob);
        System.out.println("Enter the amount you want to deposit: ");
        sa.deposit(s.nextDouble());
        System.out.println(sa);
        System.out.println(" Current balance is: " + sa.getBalance());
        System.out.println("Enter the amount you want to withdraw: ");
        sa.withdraw(s.nextDouble());
        System.out.println(sa);
        System.out.println(" Current balance is: " + sa.getBalance());

        s.nextLine();
        System.out.println("Enter the account number: ");
        long acc1 = s.nextLong();
        s.nextLine();
        System.out.println("Enter the account holder name: ");
        String name1 = s.nextLine();
        System.out.println("Enter the account holder address: ");
        String add1 = s.nextLine();
        System.out.println("Enter the account holder phone number: ");
        String phNo1 = s.nextLine();
        System.out.println("Enter the account holder date of birth: ");
        String dob1 = s.nextLine();
//        LoanAccount la = new LoanAccount(acc,name,add,phNo,dob);
        LoanAccount la = new LoanAccount(acc1,name1,add1,phNo1,dob1);
        System.out.println("Enter the amount you have to pay as EMI: ");
        la.payEmi(s.nextDouble());
        System.out.println(la);
        System.out.println(" Current balance is: " + la.getBalance());
        System.out.println("Enter the amount you want to repay: ");
        la.rePay(s.nextDouble());
        System.out.println(la);
        System.out.println(" Current balance is: " + la.getBalance());
    }
}
