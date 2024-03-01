package Characters;

import java.util.Scanner;
import java.util.Random; // De folosit pentru atacuri secundare

public class Main {
    public static void main(String[] args) {
        // Creare instante de caractere Player si Enemy
        Scanner sc = new Scanner(System.in);
        Character Player = new Character(100, 100, 10);
        Character Enemy = new Character(50, 100, 2);

        System.out.print("You found a sword on your way, do you want to pick it up? (1 for yes, 0 for no) -> ");
        int yn = sc.nextInt();
        String swordname = null;
        boolean yesno = false;
        if (yn == 1) {
            yn = 0;
            yesno = true;
            System.out.print("Name your sword -> ");
            swordname = sc.next();
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.print("You find a piece of armor on the ground, would you like to pick it up? (1 for yes, 0 for no) -> ");
        yn = sc2.nextInt();
        Armor armor1 = new Armor(" ", 0, 0);
        armor1.setOwned(false);
        if (yn == 1) {
            armor1.setName("Level 1 Armor");
            armor1.setDamageReduction(3);
            armor1.setDurability(100);
            armor1.setOwned(true);
        }
        sc.close();
        sc2.close();

        Weapons Sword = new Weapons(swordname, 20, 100, yesno);

        if (Sword.isOwned() && Sword.getDurability() >= 1) {
            Player.setDamage(Player.getDamage() + Sword.getDamageUp());
        }


        // ACTIUNI //// ACTIUNI //// ACTIUNI //// ACTIUNI //// ACTIUNI //// ACTIUNI // ACTIUNI //// ACTIUNI //// ACTIUNI //// ACTIUNI //// ACTIUNI //
        rest(Player, Enemy);

        //  while(Enemy.getHP()>=1)
        System.out.println("[Durability] " + Sword.getName() + " = " + Sword.getDurability());
        System.out.println("[Energy] Player = " + Player.getEnergy());
        System.out.println("[HP] Enemy = " + Enemy.getHP());
        attackEnemy(Player, Enemy, Sword);
        System.out.println("[Durability] " + Sword.getName() + " = " + Sword.getDurability());
        System.out.println("[Energy] Player = " + Player.getEnergy());
        System.out.println("[HP] Enemy = " + Enemy.getHP());
        attackEnemy(Player, Enemy, Sword);
        System.out.println("[Durability] " + Sword.getName() + " = " + Sword.getDurability());
        System.out.println("[Energy] Player = " + Player.getEnergy());
        System.out.println("[HP] Enemy = " + Enemy.getHP());
        attackEnemy(Player, Enemy, Sword);
        System.out.println("[Durability] " + Sword.getName() + " = " + Sword.getDurability());
        System.out.println("[Energy] Player = " + Player.getEnergy());
        System.out.println("[HP] Enemy = " + Enemy.getHP());


        System.out.println("[HP] Player = " + Player.getHP());
        System.out.println("[Durability] Armor = " + armor1.getDurability());
        enemyAttacksPlayer(Enemy, Player, armor1);
        System.out.println("[Durability] Armor = " + armor1.getDurability());

        System.out.println("[HP] Player = " + Player.getHP());
        System.out.println("[HP] Enemy = " + Enemy.getHP());
        System.out.println("[Energy] Player = " + Player.getEnergy());
        System.out.println("[Durability] " + Sword.getName() + " = " + Sword.getDurability());

        rest(Player, Enemy);

    }

    public static void HPUp(Character Player, float n) {
        Player.setHP(Player.getHP() + n);
    }

    public static void rest(Character Player, Character Enemy) {
        if (Enemy.getHP() >= 0) {
            System.out.println("You cannot rest now, there are still enemies nearby");
        } else {
            Player.setHP(Player.getHP() + 2);
            Player.setEnergy(Player.getEnergy() + 5);

            System.out.println("Rested and regained 2 HP and 5 Energy");
            System.out.println("HP is now " + Player.getHP());
            System.out.println("Energy is now " + Player.getEnergy());
        }
    }

    public static void attackEnemy(Character Player, Character Enemy, Weapons x) {
        if (Enemy.HP >= 1 && Player.Energy >= 10)
        {
            if (x.getDurability() >= 1 && x.isOwned())
                x.setDurability(x.getDurability() - 2);
            else if (x.isOwned())
            {
                x.setOwned(false);
                x = null;
            }
            Player.setEnergy(Player.getEnergy() - 10);
            Enemy.HP = Enemy.HP - Player.Damage;
            System.out.println("Enemy has been attacked for " + Player.getDamage() + " damage");
        }
        else
        {
            System.out.println("Enemy is dead");
            // x.setDurability(x.getDurability() + 5);
            Enemy = null;
        }
    }

    public static void enemyAttacksPlayer(Character E, Character P, Armor a) {
        if (P.HP >= 1 && E.getHP() >= 1 && E.getEnergy()>=10)
        {
            if (!a.isOwned) {
                E.setEnergy(E.getEnergy()-10);
                P.setHP(P.getHP() - E.getDamage());
                System.out.println("Enemy hit you dealing " + E.getDamage() + " damage and you have " + P.getHP() + " HP left");
            }
            else if (E.getEnergy()<=9)
            {
                System.out.println("Enemy has no energy and cannot attack");

            }
            else
            {
                P.setHP(P.getHP() - (E.getDamage() - a.getDamageReduction() / 100 * E.getDamage()));
                a.setDurability(a.getDurability() - (E.getDamage() * (((float) 1 / 3) * a.getDamageReduction())));
                E.setEnergy(E.getEnergy()-10);
            }
        }
        else
            System.out.println("Enemy is dead and cannot attack the player");

    }


}



