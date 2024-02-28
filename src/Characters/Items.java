package Characters;

public class Items
{
    public String Name;
    public float DamageUp;
    public float Durability;
    public boolean Owned;
    public Items(String name, float damageUp, float durability, boolean owned)
    {
        super();
        this.Name = name;
        this.DamageUp = damageUp;
        this.Durability = durability;
        this.Owned = owned;
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
}
