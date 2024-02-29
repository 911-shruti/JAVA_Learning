public class CWH_10_DataTypeofExpression_IncDec {
    public static void main(String[] args) {
       /*
        int a =45+4;
        float v = 6.54f;
        byte x = 5;
        int y= 6;
        short z = 8;
        int b = y+z;
        float c = v+x;
        b + s = int         b=byte  s=short  s = short  d= double
        s+i = int            i = int  c=char  l = long
        L+F = float
        i+f = float
        c+i = int
        c+s = int
        l+d =double
        f+d = double
        System.out.println(c);
         */
        
        //Increment & Decrement Operator
        int i = 56;
        //int b= i++;
        // first b is assigned i then i is assigned b
        int j =67;
        int c= ++j;
        //first j is incremented then j is assigned to c
        System.out.println(i++);
        //first use then increment
        System.out.println(i);
        System.out.println(++i);
        //first increment then use
        System.out.println(i);
        int y = 7;
       System.out.println(++y*8);
        char CH ='a';
         System.out.println(++CH); // a will increment into b
            
    }
}
