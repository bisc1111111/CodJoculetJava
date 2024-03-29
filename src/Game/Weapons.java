package Game;

import java.awt.*;

public class Weapons
{
    public String Name;
    public float DamageUp;
    public float Durability;
    public boolean Owned;
    public int weaponX;
    public int weaponY;
    public int pos;

    public Weapons(String name, float damageUp, float durability, boolean owned)
    {
        super();
        this.Name = name;
        this.DamageUp = damageUp;
        this.Durability = durability;
        this.Owned = owned;
    }

    public Weapons(int weaponX, int weaponY) {
        super();
        this.weaponX = weaponX;
        this.weaponY = weaponY;
    }

    // Setters
    public void setName(String name) {this.Name = name;}
    public void setDurability(float durability) {Durability = durability;}
    public void setDamageUp(float damageUp) {DamageUp = damageUp;}
    public void setOwned(boolean owned) {Owned = owned;}

                        // Getters
    public float getDamageUp() {return DamageUp;}
    public String getName() {return Name;}
    public float getDurability() {return Durability;}
    public boolean isOwned() {return Owned;}

    public void draw(Graphics g, Board board) {
    }
    public int getPos(){return pos;}
}
