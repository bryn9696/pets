import java.util.ArrayList;
import java.util.Scanner;

public class pet {

    public static void main(String[] args) {
        String dontLikeFoodOne = "\uD83D\uDE21";
        String dontLikeFoodTwo = "\uD83E\uDD22";
        String dontLikeFoodThree = "\uD83E\uDD2E";

        String faveFoodOne = "\uD83D\uDE42";
        String faveFoodTwo = "\uD83E\uDD17";
        String faveFoodThree = "\uD83D\uDE06";

        int counter = 0;
        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("beans");

        // String food = "";
        // System.out.println("I'm hungry");
        // Scanner scan = new Scanner(System.in);
        // System.out.print("What's my food: ");
        // food = scan.next();

        foodInput food = new foodInput();
        food.food();

        while (!foodList.contains(food)) {
            counter += 1;
            if (counter == 3) {
                System.out.println(dontLikeFoodOne);
                System.out.println("Game over!");
                break;
            } else {
                if (counter == 0) {
                    System.out.println(dontLikeFoodOne);
                    // System.out.print("What's my food: ");
                    food.food();
                } else if (counter == 1) {
                    System.out.println(dontLikeFoodTwo);
                    // System.out.print("What's my food: ");
                    food.food();
                } else if (counter == 2) {
                    System.out.println(dontLikeFoodThree);
                    // System.out.print("What's my food: ");
                    food.food();
                }
            }                
        }

        if (foodList.contains(food) && counter == 0) {
            // scan.close();
            System.out.println(faveFoodOne);
        } else if (foodList.contains(food) && counter == 1) {
            // scan.close();
            System.out.println(faveFoodTwo); 
        } else if (foodList.contains(food) && counter == 2) {
            // scan.close();
            System.out.println(faveFoodThree); 
        }
        
    }

}
