package CWH;
// interface: Group of related methods with Empty bodies
//we use keyword interface
//to impliment we use keyword impliments
//we must initialize all the methods if we want to impliment interface in an class
//cannot modify properties of an interface since they are final by nature
interface Bicycle{
    int a = 45;
    int applyBreaks(int decrement);
    int speedUp(int increment);
    void bloHorn();
}
class AvonCycle implements Bicycle{
    int speed=8;
    public int applyBreaks(int decrement){
        return speed = speed-decrement;
    }
    public int speedUp(int increment){
        return speed = speed+increment;
    }

    @Override
    public void bloHorn() {
        System.out.println("kabhi khusi kabhi gam");
    }
}

public class CWH_54_Interfaces {
    public static void main(String[] args) {
AvonCycle A = new AvonCycle();
        System.out.println(A.speedUp(8));
        A.bloHorn();
    }

}
