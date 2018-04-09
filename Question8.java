package advancedprogrammingskills;

import java.util.Scanner;

public class Question8 {

    public static int calcSum(int endNum, int increment) {
        int sum = 0;
        if (endNum <= increment) {
            return sum;
        } else {
            sum += endNum + calcSum(endNum - increment, increment);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("What value (number) do you want to stop at (greater than 0)? ");
        int endNum = input.nextInt();

        System.out.println("What value (number) do you want to increment/start by (greater than 0)? ");
        int increment = input.nextInt();

        if (endNum % increment != 0) {
            System.out.println("End number and increment must be evenly divisable");
        } else {
            System.out.println("The sum is " + calcSum(endNum, increment));
        }
    }

}
