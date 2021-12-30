public class MultithreadingSingleClass extends Thread{
    public void run(){
        int i=1;
        while (true) {
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MultithreadingSingleClass m = new MultithreadingSingleClass();
        m.start();
        int i=1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
