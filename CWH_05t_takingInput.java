import java.util.Scanner;

public class CWH_05t_takingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        //system.in lets us know what we are using our keybord to take input
        //sc is an object of scanner class it can be named anything
        // scanner class has a lot of methods to take inputs from the user
//        System.out.println("enter num1");
//        boolean b1 = sc.hasNextInt();
//        boolean b1 = sc.hasNextFloat();
//        //tels if user has entered an( integer / float etc.) value or not and to write an errorless program
//        System.out.println(b1);
//       // float a = sc.nextFloat();
//        int a = sc.nextInt();
//        System.out.println("enter num2");
//       // float b = sc.nextFloat();
//        int b = sc.nextInt();
////        float sum = a+b;
//        int sum = a+b;
//        System.out.println("the sum is: "+ sum);
        String str = sc.nextLine();
        System.out.println(str);
//        sc.next method only reads a word but nextLine method reade whole line 

    }
}

