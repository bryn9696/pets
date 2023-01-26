import java.awt.event.MouseEvent;

public class fight {

    int battle(org.w3c.dom.events.MouseEvent event) {
        
        System.out.println("FIGHT");
        int healthLevel = 0;
        
        if (((MouseEvent) event).getClickCount() >= 3) {
            System.out.println( "You won the fight!"); 
            healthLevel = 1; }
         else {
            System.out.println( "You lost the fight"); 
            healthLevel = -1; }
        
        return healthLevel;
    }
}
