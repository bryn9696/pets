import java.util.Scanner;

public class direction {
    public float whichWay() {
        System.out.println("Left or Right?");
        Scanner scan = new Scanner(System.in);
        String direction = scan.next();

        float hungerLevel = 0;

        if (direction.equals("left")) {
            System.out.println("no food here");
            hungerLevel +=  -0.1;
        } else if (direction.equals("right")) {
            System.out.println("Yay! food");
            hungerLevel +=  0.1;
        } 

        return hungerLevel;
    }
}
