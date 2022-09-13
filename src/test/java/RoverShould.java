import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverShould {

    @Test
    void
    does_not_turn() {
        assertEquals("0:0:N", new Rover().execute(""));
    }
    @Test
    void
    turn_right_once() {
        assertEquals("0:0:E", new Rover().execute("R"));
    }

    @Test
    void
    turn_right_twice() {
        assertEquals("0:0:S", new Rover().execute("RR"));
    }
    @Test
    void
    turn_right_three_times() {
        assertEquals("0:0:W", new Rover().execute("RRR"));
    }

}