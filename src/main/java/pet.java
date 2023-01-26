import java.util.ArrayList;
import java.util.Hashtable;

import org.w3c.dom.events.MouseEvent;

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
        float petHealth = 1;
        float petHealthReturn = petHealth;
        int petAge = 0;

        Hashtable<String, Integer>
        userScore = new Hashtable<String, Integer>();

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("beans");

        foodInput food = new foodInput();
        String foodItem = food.food();

        userScore.put(petName, (petAge));

        while (petAge >= 0)  {

            while (!foodList.contains(foodItem) && petHealth != -1) {
                guessCounter += 1;
                if ( foodItem.equals("q") || foodItem.equals("quit")) {
                    petHealthReturn = petHealth;
                    petAge = -1; 
                    // System.out.println(userScore);
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

            if ( foodItem.equals("q") || foodItem.equals("quit")) {
                petHealthReturn = petHealth;
                System.out.println(userScore);
                petAge = -1; 
                break;
            } else if (foodList.contains(foodItem) && guessCounter == 0) {
                guessCounter = 0;
                direction directionClass = new direction();
                double direction = directionClass.whichWay();
                if (direction == 0) {
                    // fight fightClass = new fight();
                    // int fight = fightClass.battle(event);
                    // System.out.println(fight);
                } else { petHealth += direction; }
                if (direction < 0) {System.out.println(dontLikeFoodOne);}
                else {System.out.println(faveFoodOne);}
                System.out.println(petName + "'s health is now " + petHealth + "!" ) ;
            } else if (foodList.contains(foodItem) && guessCounter == 1) {
                guessCounter = 0;
                direction directionClass = new direction();
                double direction = directionClass.whichWay();
                if (direction == 0) {
                    // fight fightClass = new fight();
                    // int fight = fightClass.battle(event);
                    // System.out.println(fight);
                } else { petHealth += direction; }
                if (direction < 0) {System.out.println(dontLikeFoodOne);}
                else {System.out.println(faveFoodTwo);}
                System.out.println(petName + "'s health is now " + petHealth + "!" ); 
            } else if (foodList.contains(foodItem) && guessCounter == 2) {
                guessCounter = 0;
                direction directionClass = new direction();
                double direction = directionClass.whichWay();
                if (direction == 0) {
                    // fight fightClass = new fight();
                    // int fight = fightClass.battle(event);
                    // petHealth += fight;
                    // System.out.println(petName + "'s health is " + petHealth);
                } else { petHealth += direction; }
                if (direction <4) {System.out.println(dontLikeFoodOne);}
                else {System.out.println(faveFoodThree);}
                System.out.println(petName + "'s health is now " + petHealth + "!" ); 
            } else if (guessCounter > 2) {
                System.out.println(petName + " died from not enough food");
                System.out.println(userScore);
                break;
            }

            if (petHealth == 5) {
                petAge += 1;
                petHealth = 1;
                System.out.println(petName + " is now " + petAge + " years old!");
            }

            if (petAge > 0 && petHealth == 0) {
                petAge -= 1;
                System.out.println(petName + " is now " + petAge);
            } else if (petAge < 0) {
                System.out.println(petName + " died from not enough food");
                System.out.println(userScore);
            }

            foodItem = food.food();
        }
    }

}
