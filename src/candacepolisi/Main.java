package candacepolisi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey whats your name?");
        String name= input.nextLine();
        System.out.println("Nice to meet you  "+ name+ ".  Pick a game: type a for me to guess your number or type b for you to guess my number ");
        // write your code here
        String game= input.nextLine();
        if (game.equals("a")){
        String response = "";
        int min = 1;
        int max = 100;
        int guess;

        System.out.println("think of a number 1-100. Okay? Now let me try to guess it.");
        while (!(response.equals("correct"))) {
            guess = (min + max) / 2;
            System.out.println("hey is ur number  " + guess + "  respond w correct, higher, or lower ");
            response = input.nextLine();
            if ((response.equals("correct")) || (response.equals("lower")) || (response.equals("higher"))) {
                if (response.equals("correct")) {
                    System.out.println("yay i knew your number was  " + guess);
                } else {
                    if (response.equals("higher")) {
                        System.out.println("darn let me guess again");
                        min = guess;
                    }
                    if (response.equals("lower")) {
                        System.out.println("darn let me guess again");
                        max = guess;
                    }
                }
            } else {
                System.out.println("invalid input type higher, lower, or correct to continue");
            }
        }
     }
     if (game.equals("b")){
         double num= Math.random();
         int num1= 100*num;
         System.out.println("guess the secret number 1-100");
         int guess = input.nextInt();
         while ((guess > num1) || (guess < num1)) {
             System.out.println("guess again noob");
             guess = input.nextInt();
         }
         System.out.println("You got it dude! The number was indeed  " + num1);
     }
     else{
         System.out.println("not a valid input type either a or b ");
     }
        }


}


