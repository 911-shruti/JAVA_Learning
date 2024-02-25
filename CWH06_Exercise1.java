import java.util.Scanner;
public class CWH06_Exercise1 {
    public static void main(String[] args) {


//    finding percentage of 5 subjects from marks obtained by maximum marks allowed
    /*
    step 1  : Divide the test marks by maximum marks
    step 2 : multiply the result by 100
     */
        System.out.println("Enter the obtained marks of 6 subjects : ");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the mark of Subject1 : ");
        float s1 = S.nextFloat();
        System.out.println("Out of : ");
        float s1out = S.nextFloat();
        System.out.println("Enter the mark of Subject2 : ");
        float s2 = S.nextFloat();
        System.out.println("Out of : ");
        float s2out = S.nextFloat();
        System.out.println("Enter the mark of Subject3 : ");
        float s3 = S.nextFloat();
        System.out.println("Out of : ");
        float s3out = S.nextFloat();
        System.out.println("Enter the mark of Subject4 : ");
        float s4 = S.nextFloat();
        System.out.println("Out of : ");
        float s4out = S.nextFloat();
        System.out.println("Enter the mark of Subject5 : ");
        float s5 = S.nextFloat();
        System.out.println("Out of : ");
        float s5out = S.nextFloat();
        System.out.println("Enter the mark of Subject5 : ");
        float s6 = S.nextFloat();
        System.out.println("Out of : ");
        float s6out = S.nextFloat();
        float TotalSM = s1+s2+s3+s4+s5+s6;
        float total = s1out+s2out+s3out+s4out+s5out+s6out;
        float p = TotalSM/total;
        float per = p*100;
        System.out.println("the percentage of 5 subjects out of " + total+"is : " + per+"%");
    }
}
