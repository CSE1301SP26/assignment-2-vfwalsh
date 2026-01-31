import java.util.Random;
import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print ("What is the starting number of sticks? ");
            int sticks = in.nextInt();

            if (sticks < 1) {
                System.out.print ("What is the starting number of sticks? ");
            }

            for (int i = 1; sticks >= 0; i++) {

                while (sticks > 0) {

                    System.out.print("How many sticks do you want to take? ");
                    int playerTake = in.nextInt();

                if (playerTake == 1 || playerTake == 2 || playerTake > sticks) {
                    System.out.println("Round " + i + ": " + sticks + " at start, human takes " + playerTake + ", so " + (sticks -= playerTake) + " remain.");
                } else {
                    System.out.println("Please enter either 1 or 2: ");     
                }
                    
                if (sticks == 0) {
                    System.out.print("You took the last stick, you lose!");
                }
                
                int one = 1;
                int two = 2;
                Random random = new Random();

                if (sticks > 0) {
                    i++;
                    if (sticks >= 2) {
                        int computerTake = random.nextBoolean() ? one : two;
                        System.out.println("Round " + i + ": " + sticks + " at start, computer takes " + computerTake + ", so " + (sticks -= computerTake) + " remain.");
                        i++;

                    } else {
                        int Final = 1;
                        System.out.println("Round " + i + ": " + sticks + " at start, computer takes " + Final + ", so " + (sticks -= Final) + " remain.");

                    }

                        //how to make the computer not take the sticks into negative

                    if (sticks == 0) {
                        System.out.print("Computer took the last stick, you win!");
                    }
                }

                } 

            }
           
        in.close();
    }    
        
}
       








