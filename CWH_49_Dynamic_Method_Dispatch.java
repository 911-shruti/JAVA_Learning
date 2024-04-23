package CWH;
class  Phone{
    public void on(){
        System.out.println("turning on phone");
    }
    public void greet(){
        System.out.println("good morning");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("aapka swagat hai ");
    }

    @Override
    public void on(){
        System.out.println("turning on smart phone....");
    }
}
public class CWH_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//Phone obj = new Phone();//Allowed
//obj.name();
//SmartPhone smp = new SmartPhone();//Allowed
        Phone obj1 = new SmartPhone(); // yup allowed
        //super class's refrence can refer to sub class but sub class's reference cannot.
        // can only access the methods of super class

//        SmartPhone obj2 = new Phone(); // not allowed
        obj1.greet();
        obj1.on();
//        obj1.swagat(); // not allowed
        //Dynamic method dispatch it means it is decided at the run time that what method will run
        //becouse the obj is made at runtime
    }
}
