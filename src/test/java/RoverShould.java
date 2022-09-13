import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverShould {

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

}