package CWH;
class C1{
    public int x= 5;
    protected int y = 45;
    int z= 6;
    private int a = 77;
//    public void meth1(){
//        System.out.println("this is meth 1");
//        System.out.println("public int x : " +x);
//        System.out.println(" proctected int y: "+ y);
//        System.out.println("default int z : "+z);
//        System.out.println("private int a : "+a);
}
class C extends C1{
public void meth2(){
    System.out.println("this is meth 2");
    System.out.println("public int x : " +x);
    System.out.println(" proctected int y: "+ y);
    System.out.println("default int z : "+z);
//    System.out.println("private int a : "+a);private cannot be accessed
}
     }

public class CWH_66_Access_Modifiers {
    public static void main(String[] args) {
        C c = new C();
        c.meth2();
    }
}
