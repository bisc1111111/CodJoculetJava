package Characters;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
                // Creare instante de caractere Player si Enemy
        Scanner sc = new Scanner(System.in);
        Character Player = new Character(100, 100, 10);
        Character Enemy = new Character(50,100,2);

        System.out.print("You found a sword on your way, do you want to pick it up? (1 for yes, 0 for no) -> ");
        int yn = sc.nextInt();
        String swordname=null;
        boolean yesno = false;
        if(yn==1)


        {
            yesno = true;
            System.out.print("Name your sword -> ");
            swordname = sc.next();
        }
        sc.close();

        Items Sword = new Items(swordname,20,100, yesno);

        if(Sword.isOwned() && Sword.getDurability()>=1)
            {
                Player.setDamage(Player.getDamage()+Sword.getDamageUp());
            }

        rest(Player,Enemy);
        // Player ataca Enemy
        //  while(Enemy.getHP()>=1)
        attackEnemy(Player, Enemy, Sword);


        System.out.println("[HP] Enemy = " + Enemy.getHP());

        System.out.println("[HP] Player = " + Player.getHP()); // Control HP Player inainte de HPUp
        // HP Up pentru Player
        // HPUp(Player, 10);

        System.out.println("[HP] Player = " + Player.getHP()); // Control HP Player dupa HPUp
        System.out.println("[Energy] Player = " + Player.getEnergy());
        System.out.println("[Durability] " + Sword.getName() + " = " + Sword.getDurability());


        rest(Player,Enemy);



    }
    public static void HPUp(Character Player, float n)
    {
        Player.setHP(Player.getHP()+n);
    }
public static void rest(Character Player, Character Enemy)
{
        if (Enemy.getHP() >= 0)
        {
            System.out.println("You cannot rest now, there are still enemies nearby");
        }
        else {
            Player.setHP(Player.getHP()+2);
            Player.setEnergy(Player.getEnergy()+5);

            System.out.println("Rested and regained 2 HP and 5 Energy");
            System.out.println("HP is now " + Player.getHP());
            System.out.println("Energy is now " + Player.getEnergy());
        }
}
    public static void attackEnemy(Character Player, Character Enemy, Items x)
    {
        if(Enemy.HP != 0 && Player.Energy>=10)
        {
            if(x.getDurability()>=1 && x.isOwned())
                x.setDurability(x.getDurability() - 2);
                else if (x.isOwned())
                {
                    x.setOwned(false);
                    x = null;
                }
            Player.setEnergy(Player.getEnergy() - 10);
            Enemy.HP = Enemy.HP - Player.Damage;
        }
        else
            {
                System.out.println("Enemy is dead");
                x.setDurability(x.getDurability()+5);
                Enemy = null;
            }
        }
    }
