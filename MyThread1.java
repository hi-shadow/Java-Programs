class th extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("I Am Using a Th  classss");
            System.out.println("I Am Happy Now");
        }
    }
}
class th1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("I Am Using a Thhhhhhhhhhhhhhhhhhhhhh  classss");
            System.out.println("I Am Sad Now");
        }
    }
}


public class MyThread1 {
    public static void main(String[] args) {
        th t = new th();
        th1 t1 = new th1();
         t.start();
         t1.start();
        
    }
    
}
