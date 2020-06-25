import characters.Enemy;
import characters.magical.WhiteMage;
import characters.physical.Warrior;
import org.junit.Before;
import org.junit.Test;
import types.CreatureType;
import types.SpellType;
import types.WeaponType;

import static org.junit.Assert.*;

public class WhiteMageTest {
    private CreatureType demon;
    private WhiteMage whitemage;
    private SpellType firaga;
    private SpellType cure;

    @Before
    public void before(){
        demon = CreatureType.DEMON;
        firaga = SpellType.FIRAGA;
        cure = SpellType.CURE;
        whitemage = new WhiteMage("Harry", 1000, 1, 100, 50, demon);
    }

    @Test
    public void hasMagicPoints(){
        assertEquals(100, whitemage.getMagicPoints());
    }

    @Test
    public void hasMana(){
        assertEquals(50, whitemage.getMana());
    }

    @Test
    public void hasCreature(){
        assertEquals(demon, whitemage.getCreature());
    }

    @Test
    public void hasNoSpellInitially() {
        assertNull(whitemage.getSpell());
    }

    @Test
    public void canCheckIfHasSpell__false() {
        assertFalse(whitemage.hasSpell());
    }

    @Test
    public void canCheckIfHasSpell__true() {
        whitemage.equipSpell(cure);
        assertTrue(whitemage.hasSpell());
    }

    @Test
    public void canEquipWhiteMagic() {
        whitemage.equipSpell(cure);
        assertEquals(cure, whitemage.getSpell());
    }

    @Test
    public void cannotEquipBlackMagic() {
        whitemage.equipSpell(firaga);
        assertNull(whitemage.getSpell());
    }

    @Test
    public void canChangeHP() {
        whitemage.changeHP(-100);
        assertEquals(900, whitemage.getHealthPoints());
    }

    @Test
    public void canCastWhiteMagicSpell(){
        Warrior warrior = new Warrior("Conan", 1000, 100);
        whitemage.equipSpell(cure);
        whitemage.castSpellOn(warrior);
        assertEquals(98, whitemage.getMagicPoints());
        assertEquals(1100, warrior.getHealthPoints());
    }
}
