package DroidArena;
import Droid.*;

import java.util.Scanner;

public class DroidArena {

    static int turn = 1;
    static Scanner sc = new Scanner(System.in);

    public static Droid battle(Droid FirstDroid, Droid SecondDroid){
        Droid attacker = FirstDroid;
        Droid defender = SecondDroid;
        int initial_hp = SecondDroid.health;
        Droid tmp;
        System.out.println("Your droid:");
        System.out.println(attacker);
        System.out.println("Enemy droid:");
        System.out.println(defender);
        System.out.println("1 to attack, 2 to regenerate HP, 3 to regenerate energy");
        do {
            if(turn % 2 != 0){
                int input = sc.nextInt();
                switch (input) {
                    case 1 -> attacker.attack(defender);
                    case 2 -> attacker.heal();
                    case 3 -> attacker.restoreEnergy();
                    default -> System.out.println("Turn skipped.");
                }
            }
            else{
                if((attacker.health < initial_hp/2) & attacker.energy > 1)
                    attacker.heal();
                else {
                    attacker.attack(defender);}}
            tmp = attacker;
            attacker = defender;
            defender = tmp;
            turn++;
            System.out.println(attacker);
            System.out.println(defender);
        }
        while ((FirstDroid.health > 0) && (SecondDroid.health > 0));
        return defender;
        }
    }
