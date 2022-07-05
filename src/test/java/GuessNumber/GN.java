package GuessNumber;

import java.util.Random;
import java.util.*;

public class GN {


    public static void main(String[] args) {

        int low = 10, high = 100, maxChance = 3, count = 0;

        int number;
        Scanner input = new Scanner(System.in);
        Random guess = new Random();
        int luckynumber = guess.nextInt(high - low) + low;

        System.out.println("Guess the number from " + low + " to " + high + " in maximum chance " + maxChance);


        while (count < maxChance) {
            System.out.println("guess the number");
            number = input.nextInt();
            count++;

            if (number == luckynumber) {
                System.out.println("CONGRATULATIONS ! You found the number");
            } else if (number > luckynumber) {
                System.out.println("The number is smaller than you guessed");
            } else {
                System.out.println("The number is bigger than you guessed");
            }
        }

        if (count == maxChance) {
            System.out.println("You don't have more chance");
        }
        System.out.println("Luck number is : " + luckynumber);


    }

}



