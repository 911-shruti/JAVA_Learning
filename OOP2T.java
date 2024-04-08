public class OOP2T {
    public static void main(String[] args) {
        System.out.println("hello world");
        Person p1 = new Person("Shruti",21);
        System.out.println(p1.name+" "+p1.age+" ");
        Person p2 = new Person();
//        p1.walk();
        Developer D1 = new Developer("Shweta",21);
        D1.walk();
    }
    }

    class Person{
        String name;
        //properties
        int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        Person(){
            //compile time polymorphism
            System.out.println("Cunstructor called");
            //defoult cunstructor
        }
        Person(Person other){
            //taking value from an object
           // this(); //to call another constructor
            this.name = other.name;
            this.age = other.age;
        }
        void walk(){
            //behaviour
            System.out.println(name+" is walking.");
        }
        void  eat(){
            System.out.println(name +" is eating .");
        }
    }
    class Developer extends Person{
    public Developer(String name,int age){
        super(name, age);
        //super keyword is used to call the cunstructor & properties of parent class
    }
        void walk(){
        //runtime polymorphism
            System.out.println("Developer " + name +" is walking");
        }
    }

