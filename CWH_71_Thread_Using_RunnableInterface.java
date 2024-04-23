package CWH;

class MyThreadRunnable implements Runnable{
    public void run() {
        int i = 0;
        while (i < 100000){
            System.out.println("i'm a thread 1 made in runmethod by Runnable interface");
        i++;
    }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 100000){
            System.out.println("i'm a thread 2 made in run method by Runnable interface");
        i++;
    }
    }
}
public class CWH_71_Thread_Using_RunnableInterface {
    public static void main(String[] args) {
MyThreadRunnable b1 =new MyThreadRunnable();
Thread gun1 = new Thread(b1);
MyThreadRunnable2 b2 = new MyThreadRunnable2();
Thread gun2 = new Thread(b2);
gun1.start();
gun2.start();
    }
}
