package types;

public enum WeaponType {
    AXE("characters.physical.Warrior", 10),
    SWORD("characters.physical.Warrior", 9),
    DAGGER("characters.physical.Thief", 4),
    BOW("characters.physical.Thief", 5),
    STAFF("characters.magical.WhiteMage", 2),
    SCROLL("characters.magical.WhiteMage", 1),
    WAND("characters.magical.BlackMage", 1),
    MACE("characters.magical.BlackMage", 7);

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
