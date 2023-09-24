import heroAndboss.Boss;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossHealth(800);
        boss.setTypeDefence("PHISICAL");
        System.out.println("damage: "+boss.getBossDamage() + " health: " + boss.getBossHealth() + " defence: " + boss.getTypeDefence());
    }
}
