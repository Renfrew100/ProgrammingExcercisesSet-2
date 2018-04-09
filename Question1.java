package advancedprogrammingskills;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a divident: ");
        double dividend = input.nextDouble();

        System.out.println("Enter a divisor: ");
        double divisor = input.nextDouble();

        if (divisor == 0) {
            throw new ArithmeticException("You can't divide by 0!");
        } else {
            double quotient = dividend/divisor; //To be used if divisor is not 0  
            System.out.printf("The quotient is: " + "%.2f", + quotient);

        }
    }

}
