import characters.physical.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WarriorTest {
    private Warrior warrior;

    @Before
    public void before() {
        warrior = new Warrior("Conan", 1000, 100);
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
}
