import java.util.Scanner;

public class direction {
    public double whichWay() {
        System.out.println("Left, Right, Up or Down?");
        Scanner scan = new Scanner(System.in);
        String direction = scan.next();

        double hungerLevel = 0;
        double randomNumber = Math.random()*10;

        double left = randomNumber;
        double right = randomNumber;
        double up = randomNumber;
        double down = randomNumber;

        if (direction.equals("left")) {
            if (left > 4) {
                System.out.println("no food here");
                hungerLevel = -0.5; 
            } else { System.out.println("Yay! food");
                hungerLevel = 1;}
        } else if (direction.equals("right")) {
            if (right > 4) {
                System.out.println("no food here");
                hungerLevel = -0.5; 
            } else { System.out.println("Yay! food");
                hungerLevel = 1;}
        } else if (direction.equals("up")) {
            if (up > 4) {
                System.out.println("no food here");
                hungerLevel = -0.5; 
            } else { System.out.println("Yay! food");
                hungerLevel = 1;}
        } else if (direction.equals("down")) {
            if (down > 4) {
                System.out.println("no food here");
                hungerLevel = -0.5; 
            } else { System.out.println("Yay! food");
                hungerLevel = 1;}
        }

        return hungerLevel;
    }
}
