package CWH;
class base{
    int x;
    base(){
        System.out.println("im a constructor");
    }
    public void printme(){
        System.out.println("i'm a set me");
    }
    public int getX(int a){
        setX(a);
        return x;
    }
    public int getX(){
        return x;
    }
    public void setX(int a){
        this.x = a;
    }
}
class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("im setting in base class");
        this.y = y;
    }
}
public class CWH_45_Inheritance {
    public static void main(String[] args) {
        //object of base class
base b = new base();

b.setX(44);
        System.out.println(b.getX());
        System.out.println(b.getX(4));
//        creating an object of derived class
        Derived D = new Derived();
        D.setX(44);
        System.out.println(D.getX());
        System.out.println(D.getX(4));

        // Quick Quij :  create an class animal and derive another class Dog(ie. method bark) from it.
    }
}
