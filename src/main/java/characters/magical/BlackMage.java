package characters.magical;

import types.CreatureType;
import types.SpellType;

public class BlackMage extends Magical {
    public BlackMage(String name, int healthPoints, int strength,
                     int magicPoints, int mana, CreatureType creature) {
        super(name, healthPoints, strength, magicPoints, mana, creature);
    }

    public void equipSpell(SpellType spell) {
        boolean isBlackMagic = spell.getSpellPower() < 0;
        if (isBlackMagic) {
            this.setSpell(spell);
        }
    }
}
