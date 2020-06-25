package types;

public enum SpellType {
    FIRAGA(5, 5),
    THUNDARA(6, 7),
    ULTIMA(50, 100),
    CURA(4, 4),
    CURAGA(9, 10),
    HOLY(40, 80);

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
