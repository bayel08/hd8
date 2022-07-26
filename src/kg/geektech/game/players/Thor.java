package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{

    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.DEAFENING, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean generate = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] == this && generate == true){
                boss.setDamage(0);
            } else if (heroes[i].getHealth() > 0 && heroes[i] == this && generate == false) {
                boss.setDamage(100);
            }
        }
    }
}
