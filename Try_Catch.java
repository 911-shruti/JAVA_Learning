package CWH;

import java.util.Scanner;

class throw1{

        }
public class Try_Catch {
    public static void main(String[] args) {
        int a = 10;
        int b;
        int [] arr=new int[2];
        arr[0]=2;
        arr[1]=5;
        Scanner s = new Scanner(System.in);
//        b = s.nextInt();
        try {
//            System.out.println(10 / b);
            System.out.println(arr[3]);
        }catch(ArithmeticException error){

            System.out.println("this is an exception: "+error);
        }
        catch(ArrayIndexOutOfBoundsException gg){
            System.out.println(gg.getMessage());

        }
            finally
         {
            System.out.println("this is finnaly block of main method");
        }
//        System.out.println("hello Next Code Here");
    }
}
