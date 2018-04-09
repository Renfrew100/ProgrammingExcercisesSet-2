package advancedprogrammingskills;

import java.io.*; //For I/O files
import java.util.Scanner; //For user input of user/pass

public class Question4 {

    public static void main(String[] args) throws IOException {
        String user, pass;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a username for your Computer System: ");
        user = input.nextLine();

        System.out.print("Enter a password for your Computer System: ");
        pass = input.nextLine();

        while (true) {
            FileWriter fw = new FileWriter("UserPass.txt");
            PrintWriter pw = new PrintWriter(fw);

            //Writing username and password (that user inputted) into the text file
            pw.println(user);
            pw.println(pass);
            pw.close();

            String user_check, pass_check;
            //Checking if the new username and password entered matches the one in the system
            System.out.print("Ready to login!");
            System.out.println("");
            System.out.print("Enter a username for your Computer System: ");
            user_check = input.nextLine();

            System.out.print("Enter a password for your Computer System: ");
            pass_check = input.nextLine();

            System.out.println("");
            if (user.contains(user_check) && pass.contains(pass_check)) {
                System.out.println("Your account information is correct!");
                break;
            } else {
                System.out.println("Incorrect account information, not stored in system! Try again!");
                System.out.println("");
            }

        }

    }

}
