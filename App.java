package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
       Random rand = new Random();
       Integer guessNumber = rand.nextInt(100);

       Integer myGuess =0;
        Scanner input = new Scanner(System.in);
        
       while(myGuess!=guessNumber){
        myGuess = input.nextInt();
        if(myGuess<guessNumber){
            System.out.println("Your number is lower");
        }else if(myGuess>guessNumber){
            System.out.println("Your number is Higher");
        }else{
            System.out.println("You got it Right");
            input.close();
            
            System.exit(0);
        }
       }

    }
}
