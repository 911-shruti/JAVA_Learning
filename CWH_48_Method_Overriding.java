package CWH;
class A{
    public int a;
    public int shruti(){
        return 4;
    }
    public void meth2(){
        System.out.println("i'm method 2 of class A ");
    }

}
class B extends A{
public void meth3(){
    System.out.println("i'm method 3 of class B");
}
    @Override
    public void meth2(){
        System.out.println("i'm method 4 of class B ");
    }
}
public class CWH_48_Method_Overriding {
    public static void main(String[] args) {
A a = new A();
a.meth2();
B b = new B();
b.meth2();
    }
}
