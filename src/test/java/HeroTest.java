
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void newHero_instantiatesCorrectly_true() {
        models.Hero newHero = models.Hero.setUpNewHero();
        assertTrue(newHero instanceof models.Hero);
    }
    @Test
    public void newHero_getName_String() {
        models.Hero newHero = models.Hero.setUpNewHero();
        assertEquals("Bumblebee",newHero.getName());
    }
    @Test
    public void newHero_getAge_Int() {
        models.Hero newHero = models.Hero.setUpNewHero();
        assertEquals(23,newHero.getAge());
    }
    @Test
    public void newHero_getPower_String() {
        models.Hero newHero = models.Hero.setUpNewHero();
        assertEquals("flying",newHero.getPower());
    }
    @Test
    public void newHero_getWeakness_String() {
        models.Hero newHero = models.Hero.setUpNewHero();
        assertEquals("fire",newHero.getWeakness());
    }
    @Test
    public void newHero_getAllInstances_true() {
        models.Hero newHero = models.Hero.setUpNewHero();
        models.Hero another = models.Hero.setUpNewHero();
        assertTrue(models.Hero.getAllInstances().contains(newHero));
        assertTrue(models.Hero.getAllInstances().contains(another));
    }
    @Test
    public void newHero_getId_Int() {
        models.Hero.clearAllHeroes();
        models.Hero newHero = models.Hero.setUpNewHero();
        models.Hero another = models.Hero.setUpNewHero();
        models.Hero another1 = models.Hero.setUpNewHero();
        assertEquals(3,another1.getId());
    }
    @Test
    public void newHero_findById_id() {
        models.Hero.clearAllHeroes();
        models.Hero newHero = models.Hero.setUpNewHero();
        models.Hero another = models.Hero.setUpNewHero();
        assertEquals(2, models.Hero.findById(another.getId()).getId());
    }
}
