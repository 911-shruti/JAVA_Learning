import java.util.Arrays;

public class OOP_01KK {
    public static void main(String[] args) {
       //store 5 roll nos
//        int[] numbers = new int[5];

        //store 5 name
//        String[] name = new String[5];
//        Student[] std = new Student[5];

        //declaration only
//        Student kunal;
//        kunal = new Student(12,"Shruti",13.4f);
        //12,"Shruti",13.4f
//        kunal.rno= 12;
//        kunal.name= "Shruti Shukla";
////        kunal.marks= 33.44f;
//        System.out.println(kunal.rno);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
//        kunal.greeting();
//        System.out.println(Arrays.toString(std));

//Student ssk = new Student(23,"SSSSK",33.4f);
//        System.out.println(ssk.rno);
//        System.out.println(ssk.name);
//        System.out.println(ssk.marks);
//        ssk.greeting();

//        Student sk = new Student();
//        System.out.println(sk.rno);
//        System.out.println(sk.name);
//        System.out.println(sk.marks);

//Student random = new Student(kunal);
//System.out.println(random.rno);
//System.out.println(random.name);
//System.out.println(random.marks);
//
//Student random2 = new Student();

Student one = new Student();
Student two = one;
one.name = "Something";
System.out.println(two.name);
    }
}
class Student{
    int rno;
    String name;
    float marks;
void greeting(){
System.out.println("Hello! , my name is " + this.name);
}
    Student(int rno ,String name, float marks) {
    //int rno ,String name, float marks
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    //constructor(function) overloading
    //Student arpit = new Student(11,"Arpit",12.4f);
    //here this will be replaced with arpit
    //this keyword replaces current object
    // since we cannot put reference variable inside the template we use this keyword
//    Student(){
//        this.rno = 13;
//        this.name="Shruti";
//        this.marks=71.8f;
//    }
//cunstructor which takes value fron another object
    Student(Student other){
    this.rno=other.rno;
    this.name=other.name;
    this.marks=other.marks;
    }
    //calling a cunstructor
    Student(){
    //this is how we call a constructor from another constructor
        //internally : new Student();
this(13,"default person",100) ;
    }
}