package kg.geektech.game.players;

public class Berserk extends Hero {

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] == this) {
                heroes[i].setDamage(heroes[i].getDamage() + boss.getDamage() / 2);
            }
        }
    }
}
