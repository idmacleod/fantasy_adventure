import characters.physical.Warrior;
import org.junit.Before;
import org.junit.Test;
import types.WeaponType;

import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior warrior;
    private WeaponType sword;
    private WeaponType wand;

    @Before
    public void before() {
        warrior = new Warrior("Conan", 1000, 100);
        sword = WeaponType.SWORD;
        wand = WeaponType.WAND;
    }

    @Test
    public void hasName() {
        assertEquals("Conan", warrior.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(1000, warrior.getHealthPoints());
    }

    @Test
    public void hasStrength() {
        assertEquals(100, warrior.getStrength());
    }

    @Test
    public void hasNoWeaponInitially() {
        assertNull(warrior.getWeapon());
    }

    @Test
    public void canEquipWarriorWeapon() {
        warrior.equipWeapon(sword);
        assertEquals(sword, warrior.getWeapon());
    }

    @Test
    public void cannotEquipNonWarriorWeapon() {
        warrior.equipWeapon(wand);
        assertNull(warrior.getWeapon());
    }

    @Test
    public void canCheckIfHasWeapon__false() {
        assertFalse(warrior.hasWeapon());
    }

    @Test
    public void canCheckIfHasWeapon__true() {
        warrior.equipWeapon(sword);
        assertTrue(warrior.hasWeapon());
    }

}
