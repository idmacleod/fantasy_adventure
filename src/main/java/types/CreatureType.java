package types;

public enum CreatureType {
    DEMON(0.6),
    DRAGONKIN(0.5),
    IFRIT(0.7),
    CRITTER(0.8);

    private final double shieldPower;

    CreatureType(double shieldPower){
        this.shieldPower = shieldPower;
    }

    public double getShieldPower() {
        return shieldPower;
    }
}
