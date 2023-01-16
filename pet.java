import java.util.Scanner;

public class pet {

    public static void main(String[] args) {
        String dontLikeFoodOne = "\uD83D\uDE21";
        String dontLikeFoodTwo = "\uD83E\uDD22";
        String dontLikeFoodThree = "\uD83E\uDD2E";

        String faveFoodOne = "\uD83D\uDE42";
        String faveFoodTwo = "\uD83E\uDD17";
        String faveFoodThree = "\uD83D\uDE06";

        String food = "";
        System.out.println("I'm hungry");
        Scanner scan = new Scanner(System.in);
        System.out.print("What's my food: ");
        food = scan.next();

        while (!food.equals("beans")) {
            System.out.println(dontLikeFoodOne);
            System.out.print("What's my food: ");
            food = scan.next();
                
        }
        if (food.equals("beans") ) {
            scan.close();
            System.out.println(faveFoodTwo);
        }
    }


    // public static String food() {
    //     String food = "";
    //     System.out.println("I'm hungry");
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("What's my food: ");
    //     System.out.println("%%%%%%");
    //     food = scan.next();
    //     System.out.println("********");
    //     // scan.close();
    //     return food;
    // }
}
