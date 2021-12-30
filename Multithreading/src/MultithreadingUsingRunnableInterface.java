class Mythread1 implements Runnable{
    public void run(){
        int i=1;
        while (true) {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class MultithreadingUsingRunnableInterface {
    public static void main(String[] args) {
        Mythread1 m1 = new Mythread1();
        Thread th = new Thread(m1);
        th.start();
        int i=1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
