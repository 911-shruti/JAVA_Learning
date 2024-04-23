package CWH;
class MyEmployee{
   private int id ;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }

}

public class CWH_40_Access_Modiiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id=33;
//        harry.name ="CWH";
//         private access modifier will throw error
       harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
    }
}
