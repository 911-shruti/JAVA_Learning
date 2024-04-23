package CWH;
class EkClass{
    int a;
    public int returnnone() {
        return 1;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int getA(){
        return a;
    }
    EkClass(int a){
     this.a = a;
    }
}
class DoClass extends EkClass{

    DoClass(int a) {
        super(a);
//        Super keyword : used to
        System.out.println("an constructor of DoClass " + a);
    }
}
public class CWH_47_This_and_Super_keyword {
    public static void main(String[] args) {
EkClass e = new EkClass(55);
        System.out.println(e.getA());
        DoClass d = new DoClass(22);

    }
}
