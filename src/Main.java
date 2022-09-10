import Droid.*;
import DroidArena.*;

import static DroidArena.DroidArena.battle;

public class Main {
    static Droid Raptor = new Droid(15, 1, 2, 5,0, "Raptor");
    static Droid Wasp = new Droid(10, 1, 3, 8, 0, "Wasp");

    public static void main(String[] args) {
        System.out.println("The champion is ( " + battle(Raptor, Wasp) + " )");
    }
}