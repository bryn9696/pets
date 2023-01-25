import java.util.ArrayList;
import java.util.Hashtable;

public class pet {
    public static void main(String[] args) {
        username pet = new username();
        String petName = pet.userName();
        
        String dontLikeFoodOne = "\uD83D\uDE21";
        String dontLikeFoodTwo = "\uD83E\uDD22";
        String dontLikeFoodThree = "\uD83E\uDD2E";

        String faveFoodOne = "\uD83D\uDE42";
        String faveFoodTwo = "\uD83E\uDD17";
        String faveFoodThree = "\uD83D\uDE06";

        int guessCounter = 0;
        float petAge = 1;
        float petAgeReturn = petAge;

        Hashtable<String, Float>
        userScore = new Hashtable<String, Float>();

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("beans");

        foodInput food = new foodInput();
        String foodItem = food.food();

        while (petAge > 0)  {

            while (!foodList.contains(foodItem) && petAge != -1) {
                guessCounter += 1;
                if ( foodItem.equals("q") || foodItem.equals("quit")) {
                    petAgeReturn = petAge;
                    petAge = -1; 
                    break;
                } else if (guessCounter == 3) {
                    System.out.println(dontLikeFoodOne);
                    System.out.println("Game over, " + petName + "!");
                    petAge = -1;
                    break;
                } else if (guessCounter < 3) {
                    if (guessCounter == 0) {
                        System.out.println(dontLikeFoodOne);
                    } else if (guessCounter == 1) {
                        System.out.println(dontLikeFoodTwo);
                    } else if (guessCounter == 2) {
                        System.out.println(dontLikeFoodThree);
                    }
                }
                foodItem = food.food();
                           
            }

            userScore.put(petName, (petAgeReturn));
            if ( foodItem.equals("q") || foodItem.equals("quit")) {
                petAgeReturn = petAge;
                System.out.println(userScore);
                petAge = -1; 
                break;
            } else if (foodList.contains(foodItem) && guessCounter == 0) {
                guessCounter = 0;
                direction directionClass = new direction();
                double direction = directionClass.whichWay();
                petAge += direction;
                if (direction < 0) {System.out.println(dontLikeFoodOne);}
                else {System.out.println(faveFoodOne);}
                System.out.println(petName + " is now " + petAge + " years old!" ) ;
            } else if (foodList.contains(foodItem) && guessCounter == 1) {
                guessCounter = 0;
                direction directionClass = new direction();
                double direction = directionClass.whichWay();
                petAge += direction;
                if (direction < 0) {System.out.println(dontLikeFoodOne);}
                else {System.out.println(faveFoodTwo);}
                System.out.println(petName + " is now " + petAge + " years old!" ); 
            } else if (foodList.contains(foodItem) && guessCounter == 2) {
                guessCounter = 0;
                direction directionClass = new direction();
                double direction = directionClass.whichWay();
                petAge += direction;
                if (direction <4) {System.out.println(dontLikeFoodOne);}
                else {System.out.println(faveFoodThree);}
                System.out.println(petName + " is now " + petAge + " years old!" ); 
            } else if (guessCounter > 2) {
                System.out.println(petName + " died from not enough food");
                System.out.println(userScore);
                break;
            }

            if (petAge < 0) {
                System.out.println(petName + " died from not enough food");
                break;
            } else { foodItem = food.food(); }
        }
    }
}
