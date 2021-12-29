package GuessNumber;
import java.util.Random;
import java.util.*;
public class GN {


          public static void main(String[] args) {

            int number1;
            Scanner input = new Scanner(System.in);
            Random number = new Random();
            int luckynumber = number.nextInt(51);
            int count = 1000;
            int times=0;
            System.out.println("Guess the number from 1 to 50 with least error");
            System.out.println("After each mistake you will lose 100 points");
            //System.out.println(luckynumber);

            do {
                System.out.println("guess the number now");
                number1 = input.nextInt();

                if (number1>luckynumber) {
                    System.out.println("The number is smaller than you guessed");
                }else if(number1<luckynumber) {
                    System.out.println("The number is bigger than you guessed");
                }
                count= count - 100;
                times ++;

            }while (number1!=luckynumber);

            System.out.println("Congratulations ! You got the number in " + times + " try!");
            System.out.println("You won " + count + " points");
            System.out.println(luckynumber);


        }




    }



