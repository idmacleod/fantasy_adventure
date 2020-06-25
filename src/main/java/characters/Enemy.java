package characters;

import types.WeaponType;

public class Enemy extends GameCharacter {
    public Enemy(String name, int healthPoints, int strength, WeaponType weapon) {
        super(name, healthPoints, strength);
        this.setWeapon(weapon);
    }

    public void equipWeapon(WeaponType weapon) {
        this.setWeapon(weapon);
    }
}