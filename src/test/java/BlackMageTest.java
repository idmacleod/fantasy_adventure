import characters.Enemy;
import characters.magical.BlackMage;
import org.junit.Before;
import org.junit.Test;
import types.CreatureType;
import types.SpellType;
import types.WeaponType;

import static org.junit.Assert.*;

public class BlackMageTest {
    private CreatureType demon;
    private BlackMage blackmage;
    private SpellType firaga;
    private SpellType cure;
    
    @Before 
    public void before(){
        demon = CreatureType.DEMON;
        firaga = SpellType.FIRAGA;
        cure = SpellType.CURE;
        blackmage = new BlackMage("Harry", 1000, 1, 100, 50, demon);
    }
    
    @Test
    public void hasMagicPoints(){
        assertEquals(100, blackmage.getMagicPoints());
    }

    @Test
    public void hasMana(){
        assertEquals(50, blackmage.getMana());
    }

    @Test
    public void hasCreature(){
        assertEquals(demon, blackmage.getCreature());
    }

    @Test
    public void hasNoSpellInitially() {
        assertNull(blackmage.getSpell());
    }

    @Test
    public void canCheckIfHasSpell__false() {
        assertFalse(blackmage.hasSpell());
    }

    @Test
    public void canCheckIfHasSpell__true() {
        blackmage.equipSpell(firaga);
        assertTrue(blackmage.hasSpell());
    }

    @Test
    public void canEquipBlackMagic() {
        blackmage.equipSpell(firaga);
        assertEquals(firaga, blackmage.getSpell());
    }

    @Test
    public void cannotEquipWhiteMagic() {
        blackmage.equipSpell(cure);
        assertNull(blackmage.getSpell());
    }

    @Test
    public void canChangeHP() {
        blackmage.changeHP(-100);
        assertEquals(900, blackmage.getHealthPoints());
    }

    @Test
    public void canCastBlackMagicSpell(){
        Enemy enemy = new Enemy("Goblin", 600, 50, WeaponType.DAGGER);
        blackmage.equipSpell(firaga);
        blackmage.castSpellOn(enemy);
        assertEquals(95, blackmage.getMagicPoints());
        assertEquals(350, enemy.getHealthPoints());
    }
}
