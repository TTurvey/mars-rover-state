import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverShould {

    @Test
    void
    turn_right() {
        assertEquals("0:0:E", new Rover().execute("R"));
    }

}