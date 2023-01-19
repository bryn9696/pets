import java.util.Scanner;

public class foodInput {
    public String food() {
        System.out.println("I'm hungry!");
        Scanner scan = new Scanner(System.in);
        System.out.print("What's my food? ");
        String food = scan.next();
        return food;
    }
}
