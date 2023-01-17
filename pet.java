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

        String food = "";
        System.out.println("I'm hungry");
        Scanner scan = new Scanner(System.in);
        System.out.print("What's my food: ");
        food = scan.next();

        while (!food.equals("beans")) {
            counter += 1;
            if (counter == 5) {
                System.out.println(dontLikeFoodOne);
                System.out.println("Game over!");
                break;
            } else {
                System.out.println(dontLikeFoodOne);
                System.out.print("What's my food: ");
                food = scan.next();
            }
                
        }
        if (food.equals("beans") ) {
            scan.close();
            System.out.println(faveFoodOne);
        }
        
    }

}
