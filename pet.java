import java.util.Scanner;

public class pet {
    public static void main(String[] args) {
        String dontLikeFoodOne = "\uD83D\uDE21";
        String faveFoodOne = "\uD83E\uDD17";

        if (food().equals("beans") ) {
            System.out.println(faveFoodOne);
        } else {
            System.out.println(dontLikeFoodOne);
        }	
    }

    public static String food() {
        System.out.println("I'm hungry");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's my food: ");
        String food = scanner.nextLine().trim();
        scanner.close();
        return food;
    }
}
