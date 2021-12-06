package statemachine.seatheater;

public enum SeatHeaterState {
    OFF {
        @Override
        SeatHeaterState next() {
            return MAX_HEAT;
        }
    },
    MAX_HEAT {
        @Override
        SeatHeaterState next() {
            return MID_HEAT;
        }
    },
    MID_HEAT {
        @Override
        SeatHeaterState next() {
            return MIN_HEAT;
        }
    },
    MIN_HEAT {
        @Override
        SeatHeaterState next() {
            return OFF;
        }
    };

    abstract SeatHeaterState next();
}
