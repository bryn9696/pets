import java.util.Scanner;

public class pet {
    public static void main(String[] args) {
        if (food().equals("beans") ) {
            System.out.println("mmmmm");
        } else {
            System.out.println("ewww");
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
