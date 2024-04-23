package CWH;


public class CWH_73_Constructors_From_Thread_Class {
    public static void main(String[] args) {
MyThr2 t1 = new MyThr2(new MyThr3(),"Shukla");
//Thread t = new Thread(t1);
//t.start();
        new Thread(t1).start();
//    MyThr tt = new MyThr("Shruti");
//    tt.start();
//    System.out.println("the id of thread t is : "+tt.getId());
//        System.out.println("the name of thread t is : "+tt.getName());

    }

}
class MyThr3 implements Runnable{
    @Override
    public void run() {
        System.out.println("this is run method in MyThr3 Clas ");
    }
}
class MyThr extends Thread{
    String name;
    public MyThr(){
        System.out.println("this is constructor of our thread");

    }
    public MyThr(String name){
        super(name);
//        this.name=name;
        System.out.println("this is overriden constructor of our thread "+super.getName() );
    }
    @Override
    public void run(){
        int i =0;
        while (i<10) {
            System.out.println("this run method overriden in thread");
            i++;
        }
    }

}
class MyThr2 implements Runnable{
    Runnable r;
    String name;
    public MyThr2(){
        System.out.println("this is thread2 constructor");
    }
    public MyThr2(String name) {
        this.name = name;
        System.out.println("this is overrriden constructor " + this.name);
    }
    public MyThr2(Runnable r,String name){
        this.r = r;
        this.name = name;
        System.out.println("This is overridden constructor " + this.name);
        System.out.println("This is overridden constructor " + this.r);

    }

    @Override
    public void run(){
        System.out.println("this is run method overriden in thread2");
    }
}
