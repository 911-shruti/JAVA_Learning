public class CWH08_Operators {
    public static void main(String[] args) {
        int a= 5;
        int b = 4 * 6;//Assignment
        
        System.out.println(a+b);
        System.out.println(4.4%.5);
        System.out.println((a+b)*4);// Arithmatic
        /*types of operators
        1>. Arithmatic (+,-,/,*,%,++,--) % modulo gives remainder ie 6%4=2
        Assignment ( =,+=,-=,*= ) += means if a+=b then it means a+b=a it updates th s ka value
        Comparison (==,<=,>=,<,>) it gives true or false while comparing
        Logical (&&,||,!)&&= all true, ||= if any value is true
        Bitwise (& , )firstly convert into bits then perform operation
                              10
                            & 11   performing and operation
                             ----
                              10
         */
        System.out.println(a==6);
        System.out.println(a<7);//Comparison

        System.out.println(88>5&&65>9);
        System.out.println(44>6&&44<9);
        System.out.println(33<5||55>4);//Logical

        System.out.println(4.4%.5);


    }
}
