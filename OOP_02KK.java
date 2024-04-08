package SSK;
public class OOP_02KK {
    int age;
    int salary;
    String name;
    boolean married;
    static long population;
    static void message(){
        System.out.println("hello i'm static");
//        System.out.println(this.age);
//        cannot use from static to non-static properties,
//        and this is referencing to an object
    }
    public OOP_02KK(int age,int salary,String name,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married= married;
        OOP_02KK.population+=1;
    }

}
