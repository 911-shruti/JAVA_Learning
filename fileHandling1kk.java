import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import  java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class fileHandling1kk {
    public static void main(String[] args) {
        //for normal read write operations use this 
        // try(InputStreamReader f = new InputStreamReader(System.in)){
        //     System.out.println("pleasr entewr some letters : ");
        //     int letters = f.read();

        //     while (f.ready()) {
        //         System.out.print((char)letters);
        //         letters = f.read();  
        //     }
        //     // f.close(); 
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }
        // try(FileReader g = new FileReader("note.txt")){
        //     int letter = g.read();
        //     while(g.ready()){
        //         System.out.print((char) letter);
        //         letter = g.read();
        //     }

        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();

        // }

        //where speed matters use this coz it is faster since it takes byte input and 
        //convert byte stream into character stream and reads bytes streams
//         try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//  //byte to char stream then reading char stream
//  //InputStreamReader to take input from the keybord
//  System.out.println("you typed : "+ br.readLine());
//  while(br.ready()){
// System.out.println(br.readLine());
//  }
//         }catch(IOException c){
//             System.out.println(c.getMessage());
//             c.printStackTrace();
//         }
       


        //OutputWriter : 
        // OutputStream os = System.out;
        // // os.write(🥲); nhot allwed range is exceeded becouse of unicode value
        // System.out.println();
        // try(OutputStreamWriter osm = new OutputStreamWriter(System.out)){
        //      osm.write("hello world");
        //      osm.write(66);
        //      osm.write('A');
        //      osm.write('\n');
        //      char[] arr = "hello world".toCharArray();
        //      osm.write(arr);
        //     //  osm.write(🥲);
        // }catch(IOException n){
        //     System.out.println(n.getMessage());
        //     n.printStackTrace();
        // }



        //outputstreamwriter has filewriter in it
//file writer does not override any public method but inharits all of its method from superclass outputstreamwriter
//same thing as  file reader
        // try(FileWriter fw = new FileWriter("note.txt",true)){
        //     fw.write("this should be appended.");
        // }catch(IOException v){
        //     System.out.println(v.getMessage());
        //     v.printStackTrace();
        // }

        

        //Using BufferedWriter to write the text and 
        //convert the byte stream into character stream and read bytes streams on its own
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt",true))){
            bw.write("hare krishna.");
        }catch(IOException v){
            System.out.println(v.getMessage());
            v.printStackTrace();
        }
    }
}
