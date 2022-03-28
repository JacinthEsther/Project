import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KnightTest {
    Knight knight;
    @BeforeEach
    void setUp(){
        knight = new Knight();
    }
    @Test
    void knightExist(){

        assertNotNull(knight);
    }

    @Test
    void boardCanBeMarked() {
        knight.move(0);
        assertEquals(1,knight.getPosition()[2][6]);
    }

    @Test
    void boardCanMoveAndTheCountIncreases() {
        knight.move(0);
        assertEquals(1,knight.getPosition()[2][6]);
        knight.move(2);
        assertEquals(2,knight.getPosition()[0][5]);
    }

    @Test
    void knightCannotFallOffTheCliff(){
        knight.move(0);
        assertEquals(1,knight.getPosition()[2][6]);
        knight.move(2);
        assertEquals(2,knight.getPosition()[0][5]);
        assertThrows(ArrayIndexOutOfBoundsException.class,()-> knight.move(2));

    }
}
