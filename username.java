import java.util.Scanner;

public class username {
    public String userName() {
        String username = "";
        while (username.isBlank()) {
            System.out.println("Enter username");
            Scanner scan = new Scanner(System.in);
            username = scan.next();
            username = username.substring(0, 1).toUpperCase() + username.substring(1);
            // scan.close();
        }
        return username;
    }
}
