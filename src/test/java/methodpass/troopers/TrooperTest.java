package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {
    Position p1 = new Position(1, 1);
    Position p2 = new Position(4, 5);
    Trooper trooper = new Trooper("initial name");

    @Test
    void createTest() {
        assertEquals("initial name", trooper.getName());
        assertEquals(0, trooper.getPosition().getPosX());
        assertEquals(0, trooper.getPosition().getPosY());
    }

    @Test
    void createTestEmptyName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new Trooper(null));
        assertEquals("A név null/üres!", iae.getMessage());
        assertThrows(IllegalArgumentException.class, ()-> new Trooper(""));
        assertThrows(IllegalArgumentException.class, ()-> new Trooper("    "));
    }

    @Test
    void changePosition() {
        trooper.changePosition(p2);
        assertEquals(4, trooper.getPosition().getPosX());
        assertEquals(5, trooper.getPosition().getPosY());
    }

    @Test
    void changePositionNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> trooper.changePosition(null));
        assertEquals("A target null!", iae.getMessage());
    }

    @Test
    void distanceFrom() {
        trooper.changePosition(p2);
        assertEquals(5, trooper.distanceFrom(p1));
    }

    @Test
    void distanceFromNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> trooper.distanceFrom(null));
        assertEquals("A target null!", iae.getMessage());
    }
}