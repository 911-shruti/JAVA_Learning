package CWH;
//Abstract Method: a method that is declared without an implementation
//Abstract class: a class that has Abstract method in it.
//Abstract class cannot have object
//Abstract class help other class to be made
//either we can make concrete class by implementing all the methods
//or you can make absract class with the help of abstract class
//cannot make object without implementing all the methods of abstract class in concrete class


abstract class Parent{
    public Parent() {
        System.out.println("i'm base two's constructor");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet1();

//    public abstract void greet2();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet1(){
        System.out.println("hi");
    }
}
abstract class Child1 extends Parent{
    public void th(){
        System.out.println("i'm good");
    }
}
public class CWH_53_AbstractClass_AbstractMethod {

    public static void main(String[] args) {
//Parent b = new Parent(); cannot make Object since itself is anAbstract class
//    Child1 c = new Child1();
    //cannot make object since it is a Abstract Class
        Child cc = new Child();
        cc.sayHello();

    }
}
