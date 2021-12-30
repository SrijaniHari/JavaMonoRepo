public class MultithreadingUsingRunnableSingleClass implements Runnable {
    public void run(){
        int i=1;
        while (true) {
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingRunnableSingleClass m1 = new MultithreadingUsingRunnableSingleClass();
        Thread th1 = new Thread(m1);
        th1.start();
        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
