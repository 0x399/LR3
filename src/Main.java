import Droid.*;
import static DroidArena.DroidArena.battle;

public class Main {
    static Droid Raptor = new Droid(15, 1, 2, 6,10, "Raptor");
    static Droid Wasp = new Droid(12, 0, 3, 7, 12, "Wasp");

    public static void main(String[] args) {
        System.out.println("The champion is ( " + battle(Raptor, Wasp) + " )");
    }
}
