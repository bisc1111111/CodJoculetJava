package Characters;

public class Character
{
        public float HP;
        public float Energy;
        public float Damage;

            public Character(float HP, float energy, float damage)
        {
            super();
            this.Energy = energy;
            this.Damage = damage;
            this.HP = HP;
        }
                        // Setters
    public void setHP(float HP) { this.HP = HP; }
    public void setDamage(float damage) { this.Damage = damage;}
    public void setEnergy(float energy) { this.Energy = energy; }

                        // Getters
    public float getDamage() { return Damage; }
    public float getHP() { return HP; }
    public float getEnergy() { return Energy; }

}
