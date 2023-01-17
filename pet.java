import java.util.ArrayList;

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

        foodInput food = new foodInput();
        String foodItem = food.food();

        while (!foodList.contains(foodItem)) {
            counter += 1;
            if (counter == 3) {
                System.out.println(dontLikeFoodOne);
                System.out.println("Game over!");
                break;
            } else {
                if (counter == 0) {
                    System.out.println(dontLikeFoodOne);
                } else if (counter == 1) {
                    System.out.println(dontLikeFoodTwo);
                } else if (counter == 2) {
                    System.out.println(dontLikeFoodThree);
                }
                foodItem = food.food();
            }                
        }

        if (foodList.contains(foodItem) && counter == 0) {
            System.out.println(faveFoodOne);
        } else if (foodList.contains(foodItem) && counter == 1) {
            System.out.println(faveFoodTwo); 
        } else if (foodList.contains(foodItem) && counter == 2) {
            System.out.println(faveFoodThree); 
        }        
    }
}
