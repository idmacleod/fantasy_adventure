package characters;

import types.WeaponType;

public class GameCharacter {
    private String name;
    private int healthPoints;
    private int strength;
    private WeaponType weapon;

    public GameCharacter(String name, int healthPoints, int strength) {
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

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public boolean hasWeapon() {
        return weapon != null;
    }

    public void changeHP(int change) {
        healthPoints += change;
    }

    public void attack(GameCharacter character) {
        int modifier =  hasWeapon() ? weapon.getAttackPower() : 1;
        int damage = -1 * strength * modifier;
        character.changeHP(damage);
    }

    public String getCharacterClass() {
        return this.getClass().getName();
    }

    public void equipWeapon(WeaponType weapon) {
        if (this.getCharacterClass().equals(weapon.getCharacterClass())) {
            this.setWeapon(weapon);
        }
    }
}
