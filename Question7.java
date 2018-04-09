package advancedprogrammingskills;

import java.util.Scanner;

public class Question7 {

    private static int[] list = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Enter a value (number) you want to find: ");
            int search = input.nextInt();
            if (binarySearch(list, search)) {
                System.out.println("The number exists in the list, which is: " + search);
            } else {
                System.out.println("The number does not exist in the list, try again!");
            }
        }
    }
    //If number is found in list, it will return true, otherwise it will return false

    private static boolean binarySearch(final int[] array, final int search) {
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                return true;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return false;
    }
}
