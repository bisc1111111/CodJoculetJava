package Game;

public class Armor
{
    public String Name;
    public float DamageReduction;
    public float Durability;
    public boolean isOwned;

    public Armor(String name, float damageReduction, float durability)
    {
        super();
        this.DamageReduction = damageReduction;
        this.Durability = durability;
        this.Name = name;
        this.isOwned();
    }



    public boolean isOwned(){return isOwned;}
    public float getDamageReduction() {return DamageReduction;}
    public float getDurability() {return Durability;}
    public String getName() {return Name;}


    public void setOwned(boolean owned) {isOwned = owned;}
    public void setDamageReduction(float damageReduction){this.DamageReduction = damageReduction;}
    public void setName(String name){this.Name = name;}
    public void setDurability(float durability){this.Durability = durability;}

}
