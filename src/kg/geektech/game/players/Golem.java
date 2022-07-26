package kg.geektech.game.players;

public class Golem extends Hero{
    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.DEFENDER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] == this && boss.getDamage() > 0){
                boss.setDamage(boss.getDamage() - 20);
                heroes[i].setHealth(heroes[i].getHealth() - heroes.length * 20);
            }
        }
    }
}
