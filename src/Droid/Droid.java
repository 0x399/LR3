package Droid;
import java.util.concurrent.ThreadLocalRandom;


public class Droid {
    public int health;
    public int armor;
    public int attack_min;
    public int attack_max;
    public int energy;
    public String name;

    public Droid(int health, int armor, int attack_min, int attack_max, int energy, String name) {
        this.health = health;
        this.armor = armor;
        this.attack_min = attack_min;
        this.attack_max = attack_max;
        this.energy = energy;
        this.name = name;
    }

    public int attack(Droid defender){
        int damage = ThreadLocalRandom.current().nextInt(this.attack_min, this.attack_max + 1);
        System.out.println(this.name + " deals " +(damage - defender.armor) + " damage to " + defender.name);
        defender.health -= (damage - defender.armor);
        return defender.health;
    }

    public int heal(){
        int ener = ThreadLocalRandom.current().nextInt(3, 5);
        this.energy -= ener;
        int heal = ThreadLocalRandom.current().nextInt(3, 7);
        if(this.energy > 0){
        this.health += heal;}
        System.out.println(this.name + " healed by " + heal + " damage using " + ener + " energy");
        return this.health;
    }

    public int restoreEnergy(){
        int ener = ThreadLocalRandom.current().nextInt(1, 4);
        System.out.println(this.name + " restored " + ener + " energy ");
        this.energy += ener;
        return this.energy;
    }

    @Override
    public String toString() {
        return "Droid" +
                " Name: " + name + "; HP: " + health +
                "; Energy: " + energy;
    }
}

