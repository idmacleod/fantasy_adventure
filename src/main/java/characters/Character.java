package characters;

import types.WeaponType;

public class Character {
    private String name;
    private int healthPoints;
    private int strength;
    private WeaponType weapon;

    public Character(String name, int healthPoints, int strength) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.weapon = null;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void changeHP(int change) {
        healthPoints += change;
    }

    public void dealDamage(Character character) {
        int damage = -1 * strength * weapon.getAttackPower();
        character.changeHP(damage);
    }
}
