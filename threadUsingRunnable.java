class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Using A Thread 1");
            System.out.println("! HAPPY !");
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Using A Thread 2");
            System.out.println("! SAD !");
        }
    }
}

public class threadUsingRunnable {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread hello = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread hi = new Thread(t2);

        hi.start();
        hello.start();

    }

}
