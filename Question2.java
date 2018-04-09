package advancedprogrammingskills;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (true) {
            try {
                System.out.println();
                System.out.println("Enter an integer value only: ");
                number = input.nextInt();
                System.out.println("You've entered: " + number);
                break;
                

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Wrong integer input! Try Again!");
                input.nextLine();
            }
        }

    }
}  
