
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newSquad_instantiatesCorrectly_true() {
        models.Squad newSquad = models.Squad.setUpNewSquad();
        assertTrue(newSquad instanceof models.Squad);
    }

    @Test
    public void newSquad_getName_String() {
        models.Squad newSquad = models.Squad.setUpNewSquad();
        assertEquals("Avengers", newSquad.getSquadName());
    }

    @Test
    public void newSquad_getSize_Int() {
        models.Squad newSquad = models.Squad.setUpNewSquad();
        assertEquals(5, newSquad.getSize());
    }

    @Test
    public void newSquad_getPower_String() {
        models.Squad newSquad = models.Squad.setUpNewSquad();
        assertEquals("Infinity Stone", newSquad.getCause());
    }

    @Test
    public void newSquad_getInstances_true() {
        models.Squad newSquad = models.Squad.setUpNewSquad();
        models.Squad another = models.Squad.setUpNewSquad();
        assertTrue(models.Squad.getInstances().contains(newSquad));
        assertTrue(models.Squad.getInstances().contains(another));
    }

    @Test
    public void newSquad_getSquadMembers_Array() {
        models.Squad newSquad = models.Squad.setUpNewSquad();
        models.Hero newHero = models.Hero.setUpNewHero();
        models.Hero newHero1 = models.Hero.setUpNewHero1();
        newSquad.setSquadMembers(newHero);
        assertEquals("Arnold", newSquad.getSquadMembers().get(0).getName());
    }

    @Test
    public void newSquad_allTestSquadMembers_Array() {
        models.Hero newHero = models.Hero.setUpNewHero();
        models.Squad newSquad = models.Squad.setUpNewSquad();
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals("Arnold", newSquad.getSquadMembers().get(0).getName());
    }

    @Test
    public void addMember_addsMemberToSquad_Hero() {
        models.Hero newHero = models.Hero.setUpNewHero();
        models.Squad testSquad = models.Squad.setUpNewSquad();
        models.Squad newSquad = models.Squad.findBySquadId(1);
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals(2, newSquad.getSquadMembers().size());
    }

    @Test
    public void setNewMember_hero() {
        models.Hero.clearAllHeroes();
        models.Hero newHwero = models.Hero.setUpNewHero();
        models.Squad testSquad = models.Squad.setUpNewSquad();
        testSquad.setSquadMembers(newHwero);

        assertEquals(1, testSquad.getSquadMembers().get(0).getId());
    }
}
