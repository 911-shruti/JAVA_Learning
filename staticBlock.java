package SSK;

public class staticBlock {
    static int a=4;
    static int b;
    //it will only run once when the first object is created
    static{
        System.out.println("i'm inside the static block");
        b= a*5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a +" "+staticBlock.b);

        staticBlock.b +=3;

        System.out.println(staticBlock.a +" "+staticBlock.b);



        staticBlock abj2 = new staticBlock();
        System.out.println(staticBlock.a +" "+staticBlock.b);
    }
}
