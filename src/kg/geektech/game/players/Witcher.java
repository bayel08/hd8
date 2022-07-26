package kg.geektech.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.RESURRECT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && heroes[7].getHealth() > 0) {
                heroes[i].setHealth(heroes[7].getHealth() - 0);
                heroes[7].setHealth(0);
            }
        }
    }
}
