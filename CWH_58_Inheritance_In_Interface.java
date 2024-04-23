package CWH;
//inheritance in interface
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childdSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childdSampleInterface{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class CWH_58_Inheritance_In_Interface {
    public static void main(String[] args) {
MySampleClass m = new MySampleClass();
m.meth1();
m.meth2();
m.meth3();
m.meth4();
    }
}
