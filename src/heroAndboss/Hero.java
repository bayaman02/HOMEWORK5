package heroAndboss;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String superAbility;

    public Hero(int heroHealth, int heroDamage, String superAbility) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superAbility = superAbility;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
