package types;

public enum SpellType {
    FIRAGA(5, -5),
    THUNDARA(6, -7),
    ULTIMA(50, -100),
    CURE(2, 2),
    CURA(4, 5),
    CURAGA(9, 10);

    private final int mpCost;
    private final int spellPower;

    SpellType(int mpCost, int spellPower) {
        this.mpCost = mpCost;
        this.spellPower = spellPower;
    }

    public int getMpCost() {
        return mpCost;
    }

    public int getSpellPower() {
        return spellPower;
    }
}
