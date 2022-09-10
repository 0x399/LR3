package DroidArena;
import Droid.*;

public class DroidArena {
    public static Droid battle(Droid FirstDroid, Droid SecondDroid){
        Droid attacker = FirstDroid;
        Droid defender = SecondDroid;
        Droid tmp;
        do {
            System.out.println(attacker.name + " deals " +(attacker.attack(defender)) + " damage to " + defender.name);
            System.out.println(defender);
            tmp = attacker;
            attacker = defender;
            defender = tmp;
        }
        while ((FirstDroid.health > 0) && (SecondDroid.health > 0));
        return defender;
        }
    }
