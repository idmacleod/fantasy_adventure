package types;

public enum WeaponType {
    AXE("Warrior", 10),
    SWORD("Warrior", 9),
    DAGGER("Thief", 4),
    BOW("Thief", 5),
    STAFF("WhiteMage", 2),
    SCROLL("WhiteMage", 1),
    WAND("BlackMage", 1),
    MACE("BlackMage", 7);

    private final String characterClass;
    private final int attackPower;

    WeaponType(String characterClass, int attackPower) {
        this.characterClass = characterClass;
        this.attackPower = attackPower;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getAttackPower(){
        return attackPower;
    }
}
