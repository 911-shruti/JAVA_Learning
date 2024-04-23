package CWH;
class Stud{
    private String id;
    private String dob;
    private String name;
    private String classList;

    public Stud(String id,String dob,String name , String classList) {
        this.id = id;
        this.classList = classList;
        this.dob = dob;
        this.name=name;
    }

    @Override
    public String toString() {
//        return "Stud{" +
//                "id='" + id + '\'' +
//                ", dob='" + dob + '\'' +
//                ", name='" + name + '\'' +
//                ", classList='" + classList + '\'' +
//                '}';
        return id;
    }

    public Stud() {
    }
}
public class Session4 {
    public static void main(String[] args) {
        for(int i = 1 ; i<=5;i++){
            Stud s = new Stud("ABc123","20/12/3",
                    switch(i){
                case 1 -> "Shruti";
                case 2 -> "rupa";
                case 3 -> " janvi";
                case 4 -> "Sobha";
                case 5 -> "shwati";
                        default -> "Anonymous";
            },
                    "Java Class");
            System.out.println(s);

        }
    }
}
