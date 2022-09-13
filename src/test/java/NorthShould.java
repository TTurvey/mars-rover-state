import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NorthShould {
    @DisplayName("MakeLeft")
    @Test
    void returns_west_object() {


        Direction result = new North().makeLeft();

        assertTrue(result instanceof West);
    }

}
