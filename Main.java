package SSK;

public class Main {
    public static void main(String[] args) {
//        System.out.println();
//        OOP_02KK kunal = new OOP_02KK(21,33000,"Kunal",false);
//        OOP_02KK Shruti = new OOP_02KK(21,300,"Shruti",false);
//        System.out.println(kunal.name+" "+kunal.age+" "+kunal.salary+" "+kunal.married);
//        System.out.println(Shruti.name+" "+Shruti.age+" "+Shruti.salary+" "+Shruti.married);
//        System.out.println(kunal.population);


       // greeting();
        fun();

//        Main obj = new Main();
//        obj.greeting();

        Main f = new Main();
        f.greeting();

    }
    static void fun(){
        //this is not dependent to an object
        System.out.println("i'm bored but can't be bored");
       // greeting();//can't use this becouse it requires an object
        //but the function you are using it in does not depend on instance
    }
    void greeting(){
        //we know that something which is not static, belongs to an object
        System.out.println("i'm hungry");
    }
    void fun2(){
        greeting();
    }
}
