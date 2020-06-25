package characters.magical;

import characters.GameCharacter;
import types.CreatureType;
import types.SpellType;

public abstract class Magical extends GameCharacter {
    private int magicPoints;
    private int mana;
    private CreatureType creature;
    private SpellType spell;

    public Magical(String name, int healthPoints, int strength,
                   int magicPoints, int mana, CreatureType creature) {
        super(name, healthPoints, strength);
        this.magicPoints = magicPoints;
        this.mana = mana;
        this.creature = creature;
        this.spell = null;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public int getMana() {
        return mana;
    }

    public CreatureType getCreature() {
        return creature;
    }

    public void equipCreature(CreatureType creature) {
        this.creature = creature;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }

    public boolean hasSpell() {
        return this.spell != null;
    }

    public void castSpellOn(GameCharacter character) {
        if (hasSpell()) {
            int cost = spell.getMpCost();
            if (magicPoints >= cost) {
                magicPoints -= spell.getMpCost();
                int impact = mana * spell.getSpellPower();
                character.changeHP(impact);
            }
        }
    }
}
