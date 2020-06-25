package characters.physical;

import characters.GameCharacter;

public class Warrior extends GameCharacter {
    public Warrior(String name, int healthPoints, int strength) {
        super(name, healthPoints, strength);
    }

    public void deathblow(GameCharacter character) {
        double random = Math.random();
        int modifier = random > 0.5 ? 2 : 0;
        int damage = -1 * getStrength() * modifier;
        character.changeHP(damage);
    }
}
