package types;

public enum WeaponType {
    AXE(10),
    DAGGER(4),
    SWORD(9),
    STAFF(2),
    BOW(5),
    MACE(7),
    CROSSBOW(6),
    WAND(1);

    private final int attackPower;

    WeaponType(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower(){
        return attackPower;
    }
}
