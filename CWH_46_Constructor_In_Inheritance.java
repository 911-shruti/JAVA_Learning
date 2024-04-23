package CWH;
class base1{
    base1(){
        System.out.println("i'm a constructor");
    }
    base1(int a){
        System.out.println("i'm an overloded constructor with value : "+ a);
    }

}
class Derived1 extends base1{
    Derived1(){
//        super(0); to load overloded constructor
        System.out.println("i'm a derived class constructor");
    }
    Derived1(int a ,int b){
        super(a);
        System.out.println("i'm an overloded constructor with value of a as : "+ a + " value of b as : "+b);

    }

}
class childOfDerived1 extends Derived1{
    childOfDerived1(){
        System.out.println("constructor of childOfDerived1 class");
    }
    childOfDerived1(int a , int b , int c){
        super(a,b);
        System.out.println("i'm an overloaded constructor of childOfDerived1 class " + c);
    }
}
public class CWH_46_Constructor_In_Inheritance {
    public static void main(String[] args) {
////base1 b = new base1();
//Derived1 D =new Derived1(41 , 9);
//childOfDerived1 C = new childOfDerived1();
childOfDerived1 c = new childOfDerived1(2,3,4);

    }
}
