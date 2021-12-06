package statemachine.seatheater;

import org.junit.jupiter.api.Test;
import statemachine.seatheater.SeatHeaterState;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void next() {
        SeatHeaterState shs = SeatHeaterState.OFF;
        assertEquals(SeatHeaterState.MAX_HEAT, shs = shs.next());
        assertEquals(SeatHeaterState.MID_HEAT, shs = shs.next());
        assertEquals(SeatHeaterState.MIN_HEAT, shs = shs.next());
        assertEquals(SeatHeaterState.OFF, shs = shs.next());
    }
}