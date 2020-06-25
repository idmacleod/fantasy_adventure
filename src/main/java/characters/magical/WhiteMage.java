package characters.magical;

import types.CreatureType;
import types.SpellType;

public class WhiteMage extends Magical {
    public WhiteMage(String name, int healthPoints, int strength,
                     int magicPoints, int mana, CreatureType creature) {
        super(name, healthPoints, strength, magicPoints, mana, creature);
    }

    public void equipSpell(SpellType spell) {
        boolean isWhiteMagic = spell.getSpellPower() > 0;
        if (isWhiteMagic) {
            this.setSpell(spell);
        }
    }
}