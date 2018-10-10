package candacepolisi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // (guesser1(5));
    }

    public static void guesser1(int num1){
        Scanner input= new Scanner(System.in);
        System.out.println("guess the secret number");
        int guess= input.nextInt();
        while ((guess> num1) || (guess<num1)){
            System.out.println("guess again noob");
            guess= input.nextInt();
        }
        System.out.println("You got it dude! The number was indeed  " + num1);
    }

    public static void guesser2(String [] args){
        String response= "";
       Scanner input= new Scanner(System.in);
        System.out.println("think of a number 1-100. Okay? Now let me try to guess it.");
        double g= Math.random();
        int g2= 100g;
        System.out.println("is it  " + g2 + "respond w higher, lower, or correct");
        while (!(response.equals("correct")))
        response= input.nextLine();
        if (response.equals("correct") || response.equals("lower") || response.equals("higher")){
            if (response.equals("correct")) {
                System.out.println("knew i'd get it. ofc the number was  " + g2);
            }
            else{
                if (response.equals("higher")){
                System.out.println("darn, lemme guess again");
                g= Math.random();
                g2= g2 + 100*g;
                }
                if (response.equals("lower")){
                    System.out.println("darn, lemme guess again");
                    g= Math.random();
                    g2= g2- 100g;
                }
            }
        }
    }
}
