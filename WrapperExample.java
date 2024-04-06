public class WrapperExample {
    public static void main(String[] args) {
        System.out.println("hello");
//        int a = 10; primitive data type
        Integer num = new Integer(45);
        //or
        Integer nu = 45;
        Integer a=10;
        Integer b=20;
        //non primitive data types
//        swap(a,b);
        System.out.println(a+ " "+b);
        //the function will not swat the values since it is a final class
        //final is a keyword which prevents the content to be modified
     final int bonus = 44;
    // bonus = 47;  not applicable
        final A kunal = new A("Shruti");
        kunal.name = "other name";
        //when a non primitive is final, you cannot reassign it
        //kunal = new A("new Object");
        //not applicable

        A  obj;
        for (int i = 0 ; i<1000000;i++){
            obj = new A("Random name");
        }

    }
    void swap (Integer a, Integer b){
        Integer temp = a;
        a= b;
        b= temp;
    }
}
class A{
//    final int num;
    //always initialise it while declaring
final int num=44;
String name;
public A(String name){
    this.name=name;
}

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
