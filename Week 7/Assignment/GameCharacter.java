public class GameCharacter {
    private final int maxHealth;
    private int health;

    public GameCharacter(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void heal(int amount) {
        this.health += amount;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }

    public int getHealth() {
        return this.health;
    }

    public static void main(String[] args) {
        GameCharacter c = new GameCharacter(100);
        System.out.println("Initial health: " + c.getHealth());
        c.takeDamage(30);
        System.out.println("After takeDamage(30): " + c.getHealth());
        c.heal(50);
        System.out.println("After heal(50): " + c.getHealth());
        c.takeDamage(150);
        System.out.println("After takeDamage(150): " + c.getHealth());
    }
}
