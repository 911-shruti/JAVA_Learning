import java.io.File;
import java.io.IOException;
import java.io.FileWriter; 
import java.io.BufferedReader;
import java.io.FileReader;


public class fileHandlin2kk {
    public static void main(String[] args) {

//         //creating the file 
//        try{
//         File fi = new File("new.txt");
//         fi.createNewFile();
//        }catch(IOException s){
// System.out.println(s.getMessage());
// s.printStackTrace();
//        }

//        // writting into the file
//        try{
//         FileWriter fw = new FileWriter("new.txt",true);
//         // fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज। अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुचः ॥66॥");
//         fw.write("zsxdcfvgbscty tyvgbhjnk fg hjgfvbn g");
//         fw.close();
//        }catch(IOException s){
// System.out.println(s.getMessage());
// s.printStackTrace();
//        }


//     //Reading the file
//     try(BufferedReader br = new BufferedReader(new FileReader("new.txt"))){
//         while(br.ready()){
//            System.out.println(br.readLine()) ;
//         }
//        }catch(IOException s){
// System.out.println(s.getMessage());
// s.printStackTrace();
//        }

       //creating the file and then delete it
       try{
        File fi = new File("Random.txt");
        fi.createNewFile();
        //delete() 
         if(fi.delete()){
            System.out.println(fi.getName() + " file is deleated .");
         }
       }catch(IOException s){
System.out.println(s.getMessage());
s.printStackTrace();
       }

    }
    
}
