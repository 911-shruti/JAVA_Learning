package CWH;

import java.util.Random;
import java.util.Scanner;

class Game
{
    int rand;
    static int count ;
    int x;
    public Game()
    {
        Random A = new Random();
        rand = A.nextInt(10);
        System.out.println("random no. generated guess it . ");
    }
    public int takeUserInput()
    {
        int input;
        System.out.println("Enter the value you want to guess : ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        return input;
    }

    public int isCorrectNumber()
    {
        int input = takeUserInput();
        while (input != rand)
        {
            if (input == rand)
            {
                return rand;
            }
            else
            {
                count++; // Increment the count when the user guesses incorrectly
                System.out.println("Try again!");
                input = takeUserInput(); // Take input again for the next guess
            }

        }
        System.out.println("congratulations !");
        getCount();


        return x;
    }
    public int setCount(){
        return count;
    }
    public static void getCount(){
        System.out.println("no. of attempts are : "+count);

    }
}
public class CWH_43_Exercise
{
     /*EXerciese 3 video 43
        create a class game , which allows a user to play"Guess the number" game once
        game should have following methods
        1. Consructor = to generate random number
        2. takeUserInput () for taking input from user
        3. isCorrectNumber () to detect whether the number given by user is correct
        4. getter and setter for no. of guesses
        use properties such as noOfGusses(int) ,etc to get the task done!

         */
     public static void main(String[] args) {
         Game G = new Game();
         G.isCorrectNumber();
     }
}
