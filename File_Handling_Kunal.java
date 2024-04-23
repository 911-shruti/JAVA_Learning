package CWH;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.*;

public class File_Handling_Kunal {
    public static void main(String[] args) {
//        try(InputStreamReader r = new InputStreamReader(System.in)){
//System.out.print("enter sone letters : ");
//int letters = r.read();
//while(r.ready()){
//    System.out.println((char) letters);
//    letters = r.read();
//    System.out.println();
//} r.close();
//        }catch(IOException a){
//            System.out.println(a.getMessage());
//
//        }

        try(FileReader fr = new
                FileReader("note.txt")) {
//            System.out.print("enter sone letters: ");
            int letters = fr.read();
            while (fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
            System.out.println();
        }
            catch(IOException c){
                System.out.println(c.getMessage());
            }
        }
    }

