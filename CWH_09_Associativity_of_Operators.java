public class CWH_09_Associativity_of_Operators {
    public static void main(String[] args) {
        /*
        int a = 6*5-34/2;

        =30-34/2
        =30-17
        13
         */
      /*   int b= 6/5-34*2;
                Left to right Associativity since * & / have same precedence
                =1.2 - 34*2
                =1.2-68
                =-67
        System.out.println(a);
        System.out.println(b);
   */
        //Precedence & Associativity
        /* Precedence = bda
         * and /  then  left to right associativity

         + and -  then left to right if it ties
         + + => right to left
         == => right to left
         */
        /* Quick Quiz  */
        int x=6;
        int y= 1;
        int a =10;
        int b= 0;
        int c = 0;
//        int k = x*y/2;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);


    }
}
