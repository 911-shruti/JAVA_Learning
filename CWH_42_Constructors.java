package CWH;
import java.util.Random;
class MyMainEmployee{
    private int id;
    private String name;
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public MyMainEmployee(){
        System.out.println("Your name here");
    }
    public MyMainEmployee(String myName,int myId){
        this.name=myName;
        id = myId;
    }

}

public class CWH_42_Constructors {
    public static void main(String[] args) {

        MyMainEmployee name= new MyMainEmployee("Shruti",12);
//        name.setName("shruti");
//        name.setId(33);
        System.out.println("the name of employee is : "+name.getName());
        System.out.println("the Id of employee is : "+name.getId());

    }
}
