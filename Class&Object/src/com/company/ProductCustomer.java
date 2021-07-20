package com.company;
import java.util.Scanner;

class Product{
        private String itemNo;
        private String itemName;
        private double price;
        private short qty;

        public String getItemNo(){ return itemNo; }
        public String getItemName(){ return itemName; }
        public double getPrice(){ return price; }
        public short getQty(){ return qty;}

        public void setPrice(double price1){
                price=price1;
        }
        public void setQty(short qty1){
                qty=qty1;
        }

        public Product(String itemNo1){
                itemNo=itemNo1;
        }
        public Product(String itemName1,String itemNo1){
                itemNo=itemNo1;
                itemName=itemName1;
        }
        public Product(String itemName1,String itemNo1,double price2,short qty2){
                itemNo=itemNo1;
                itemName=itemName1;
                setPrice(price2);
                setQty(qty2);
        }
}

class Customer{
        private String customerId;
        private String customerName;
        private String address;
        private String phnNo;

        public String getCustomerId(){ return customerId; }
        public String getCustomerName(){ return customerName; }
        public String getAddress(){ return address; }
        public String getPhnNo(){ return phnNo;}

        public void setAddress(String adress1){
                address=adress1;
        }
        public void setPhnNo(String phnNo1){
                phnNo=phnNo1;
        }

        public Customer(String customerId1){
                customerId=customerId1;
        }
        public Customer(String customerId1,String customerName1){
                customerId=customerId1;
                customerName=customerName1;
        }
        public Customer(String customerId1,String customerName1,String adress2,String phnNo2){
                customerId=customerId1;
                customerName=customerName1;
                setAddress(adress2);
                setPhnNo(phnNo2);
        }
}

public class ProductCustomer {
        public static void main(String[] args) {
                Scanner s1 = new Scanner(System.in);
                System.out.println("Enter the Item Number:");
                String itemNo2 = s1.nextLine();
                System.out.println("Enter the Item Name:");
                String itemName2 = s1.nextLine();
                System.out.println("Enter the Item price:");
                double price3 = s1.nextDouble();
                System.out.println("Enter the Item Quantity:");
                short qty3 = s1.nextShort();
//              Product p = new Product(itemNo2);
//              Product p = new Product(itemNo2,itemName2);
                Product p = new Product(itemNo2,itemName2,price3,qty3);
                System.out.println("The item number of the product is - " + p.getItemNo());
                System.out.println("The name of the product is - " + p.getItemName());
                System.out.println("The price of the product is - " + p.getPrice());
                System.out.println("The quantity of the product is - " + p.getQty());

                Scanner s2 = new Scanner(System.in);
                System.out.println("Enter the customer id: ");
                String customerId2 = s2.nextLine();
                System.out.println("Enter the customer name: ");
                String customerName2 = s2.nextLine();
                System.out.println("Enter the customer address: ");
                String address3 = s2.nextLine();
                System.out.println("Enter the customer phone number: ");
                String phnNo3 = s2.nextLine();
//              Customer c = new Customer(customerId2);
//              Customer c = new Customer(customerId2,customerName2);
                Customer c = new Customer(customerId2,customerName2,address3,phnNo3);
                System.out.println("The id number of the customer is - " + c.getCustomerId());
                System.out.println("The name of the customer is - " + c.getCustomerName());
                System.out.println("The address of the customer is - " + c.getAddress());
                System.out.println("The phone number of the customer is - " + c.getPhnNo());
        }

}
