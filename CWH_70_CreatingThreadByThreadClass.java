package CWH;
//Concurrency vs parallelism
//Concurrency: the task is running and managing multiple computation(task) at the same time.(by performing single task at a time)
//Parallelism: the task of running multiple task simultaniusly.
// multithreading hme concurrency achive krke deti h.f
class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<8000) {
            System.out.println("chatting");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<8000) {
            System.out.println("coding");
            i++;
        }
    }
}
public class CWH_70_CreatingThreadByThreadClass {
    public static void main(String[] args) {
MyThread t1 = new MyThread();
MyThread2 t2 = new MyThread2();
t1.start();
t2.start();
    }
}