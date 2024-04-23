package CWH;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CWH_111_File_Handling {
    public static void main(String[] args) {
        //file generation:
//        File myfile = new File("CWH111file.txt");
//        try {
//            myfile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }
        //file Writter:
//        try {
//            FileWriter filewritter =new FileWriter("CWH111file.txt");
//            filewritter.write("this is our first file from this java course");
//            filewritter.close();
//        } catch (IOException e) {
//          e.printStackTrace();
//        }
        try {
            File myfile2 = new File("Shruti.pdf");
            try {
                if (myfile2.exists()) {
                    myfile2.createNewFile();
                }
            } catch (IOException a) {
                System.out.println("cannot create file due to Exception : " + a);
                a.printStackTrace();
            }

            try {
                FileWriter obj = new FileWriter("Shruti.pdf");
                obj.write("hi my name is shruti shukla");
            } catch (IOException b) {
                System.out.println("cannot write into the file due to " + b);
                b.printStackTrace();
            }

            if (myfile2.exists()) {
                boolean deleted = myfile2.delete();
                if (deleted) {
                    System.out.println("the file is deleted successfully");
                } else {
                    System.out.println("failed to delete the file");
                }
            } else {
                System.out.println("the file does't exsist .");
            }
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
