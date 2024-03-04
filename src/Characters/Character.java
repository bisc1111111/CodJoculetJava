package Characters;

public class Character
{
        public float HP;
        public float Energy;
        public float Damage;
        public float XPPoints;
        public float Level;

            public Character(float HP, float energy, float damage, float xp,float lvl)
        {
            super();
            this.Energy = energy;
            this.Damage = damage;
            this.HP = HP;
            this.XPPoints = xp;
            this.Level = lvl;
        }
                        // Setters
    public void setHP(float HP) { this.HP = HP; }
    public void setDamage(float damage) { this.Damage = damage; }
    public void setEnergy(float energy) { this.Energy = energy; }
    public void setXPPoints(float xp) { this.XPPoints = xp; }
    public void setLevel(float lvl) { this.Level = lvl; }

                        // Getters
    public float getXPPoints() { return XPPoints; }
    public float getLevel() { return Level; }
    public float getDamage() { return Damage; }
    public float getHP() { return HP; }
    public float getEnergy() { return Energy; }

}
