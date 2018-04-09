package advancedprogrammingskills;

import java.util.*;

public class Question6 {

    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Bananas");
        groceryList.add("Apples");
        groceryList.add("Pineapple");
        groceryList.add("Cucumbers");
        groceryList.add("Avocadoes");
        Collections.shuffle(groceryList);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Enter the item you want to find the position of in your list or enter 'STOP' to quit: ");
            String searchItem = input.nextLine();

            if (!"STOP".equals(searchItem)) {

                if (groceryList.contains(searchItem)) {
                    int index = groceryList.indexOf(searchItem);
                    System.out.println("The item you've entered has an index of: " + index);
                } else {
                    System.out.println("The item was not found! Type an item in the list!");
                }
            } else {
                System.out.println("Alright thanks.");
                break;
            }

        }
    }
}
