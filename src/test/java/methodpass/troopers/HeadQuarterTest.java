package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadQuarterTest {
    Trooper trooper1 = new Trooper("trooper1");
    Trooper trooper2 = new Trooper("trooper2");
    Trooper trooper3 = new Trooper("trooper3");
    Trooper trooper4 = new Trooper("trooper4");

    HeadQuarter headQuarter = new HeadQuarter();

    @BeforeEach
    void init() {
        trooper2.changePosition(new Position(1, 1));
        trooper3.changePosition(new Position(2, 1));
        trooper4.changePosition(new Position(4, 5));
        headQuarter.addTrooper(trooper1);
        headQuarter.addTrooper(trooper2);
        headQuarter.addTrooper(trooper3);
        headQuarter.addTrooper(trooper4);
    }

    @Test
    void createTest() {
        assertEquals(4, headQuarter.getTroopers().size());
    }

    @Test
    void moveTrooperByName() {
        headQuarter.moveTrooperByName("trooper1", new Position(10, 20));
        assertEquals(10, trooper1.getPosition().getPosX());
        assertEquals(20, trooper1.getPosition().getPosY());
    }

    @Test
    void moveTrooperByNameNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> headQuarter.moveTrooperByName(null, new Position(0, 0)));
        iae = assertThrows(IllegalArgumentException.class, ()-> headQuarter.moveTrooperByName("", new Position(0, 0)));
        iae = assertThrows(IllegalArgumentException.class, ()-> headQuarter.moveTrooperByName("   ", new Position(0, 0)));
        assertEquals("A név null/üres!", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class, ()-> headQuarter.moveTrooperByName("trooper1", null));
        assertEquals("A target null!", iae.getMessage());
    }


    @Test
    void moveClosestTrooper() {
        headQuarter.moveClosestTrooper(new Position(2,2));
        assertEquals(1, trooper2.getPosition().getPosX());
        assertEquals(1, trooper2.getPosition().getPosY());
        assertEquals(2, trooper3.getPosition().getPosX());
        assertEquals(2, trooper3.getPosition().getPosY());
    }

    @Test
    void moveClosestTrooperNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> headQuarter.moveClosestTrooper(null));
        assertEquals("A target null!", iae.getMessage());
    }

    @Test
    void getTroopers() {
        assertEquals("trooper4", headQuarter.getTroopers().get(3).getName());
    }

    @Test
    void addTrooperNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> headQuarter.addTrooper(null));
        assertEquals("A trooper null!", iae.getMessage());
    }
}