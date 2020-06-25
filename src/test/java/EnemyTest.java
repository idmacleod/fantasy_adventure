import characters.Enemy;
import characters.physical.Warrior;
import org.junit.Before;
import org.junit.Test;
import types.WeaponType;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    private WeaponType dagger;
    private Enemy enemy;

    @Before
    public void before() {
        dagger = WeaponType.DAGGER;
        enemy = new Enemy("Goblin", 400, 50, dagger);
    }

    @Test
    public void hasName() {
        assertEquals("Goblin", enemy.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(400, enemy.getHealthPoints());
    }

    @Test
    public void hasStrength() {
        assertEquals(50, enemy.getStrength());
    }

    @Test
    public void enemyhasWeapon() {
        assertEquals(dagger, enemy.getWeapon());
    }

    @Test
    public void canGetCharacterClass() {
        assertEquals("characters.Enemy", enemy.getCharacterClass());
    }

    @Test
    public void canChangeHP() {
        enemy.changeHP(-100);
        assertEquals(300, enemy.getHealthPoints());
    }

    @Test
    public void enemyCanEquipAnyWeapon() {
        WeaponType staff = WeaponType.STAFF;
        enemy.equipWeapon(staff);
        assertEquals(staff, enemy.getWeapon());
    }

    @Test
    public void canAttack() {
        Warrior warrior = new Warrior ("Conan", 1000, 100);
        enemy.attack(warrior);
        assertEquals(800, warrior.getHealthPoints());
    }
}
