import java.util.ArrayList;
import java.util.Hashtable;

public class pet {

    public static void main(String[] args) {
        username user = new username();
        String username = user.userName();
        
        String dontLikeFoodOne = "\uD83D\uDE21";
        String dontLikeFoodTwo = "\uD83E\uDD22";
        String dontLikeFoodThree = "\uD83E\uDD2E";

        String faveFoodOne = "\uD83D\uDE42";
        String faveFoodTwo = "\uD83E\uDD17";
        String faveFoodThree = "\uD83D\uDE06";

        int guessCounter = 0;
        int petAge = 1;

        Hashtable<String, Integer>
        userScore = new Hashtable<String, Integer>();

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("beans");

        foodInput food = new foodInput();
        String foodItem = food.food();

        while (petAge != 0) {
            while (!foodList.contains(foodItem)) {
                guessCounter += 1;
                if (guessCounter == 3) {
                    System.out.println(dontLikeFoodOne);
                    System.out.println("Game over, " + username + "!");
                    petAge = 0;
                    break;
                } else {
                    if (guessCounter == 0) {
                        System.out.println(dontLikeFoodOne);
                    } else if (guessCounter == 1) {
                        System.out.println(dontLikeFoodTwo);
                    } else if (guessCounter == 2) {
                        System.out.println(dontLikeFoodThree);
                    }
                    foodItem = food.food();
                }                
            }

            if (foodList.contains(foodItem) && guessCounter == 0) {
                petAge += 1;
                System.out.println(faveFoodOne + "\n" + username + " is now " + petAge + " years old!" ) ;
            } else if (foodList.contains(foodItem) && guessCounter == 1) {
                System.out.println(faveFoodTwo + "\n" + username + " guessed it in " + (guessCounter + 1) ); 
            } else if (foodList.contains(foodItem) && guessCounter == 2) {
                System.out.println(faveFoodThree + "\n" + username + " guessed it in " + (guessCounter + 1) ); 
            } else if (guessCounter > 2) {
                break;
            }
            foodItem = food.food();
        }
        userScore.put(username, (guessCounter+1));  
    }
}
