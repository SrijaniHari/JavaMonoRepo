import java.util.Scanner;

interface Member{
    public void callBack();
}

class Store{
    Member mem[] = new Member[100];
    int count = 0;

    public void register(Member m){
        mem[count++] = m;
    }

    public void inviteSale(){
        for(int i=0; i<count; i++)
            mem[i].callBack();
    }
}

class Customer implements Member{
    String name;
    Customer (String name){
        this.name = name;
    }
    public void callBack(){
        System.out.println("Ok! I will visit !! " + "Customer - "+ name);
    }
}

public class CallBack {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the customer name:");
            String n = s.nextLine();
            Store s1 = new Store();
            Customer c1 = new Customer(n);
            s1.register(c1);
            s1.inviteSale();
        }
    }
}
