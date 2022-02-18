package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static turtle.PenState.*;

public class TurtleTest {
    Turtle turtle;
    @BeforeEach
    public void setUp(){
        turtle= new Turtle();
    }
    @Test
    public void turtleExist(){
        assertNotNull(turtle);
    }

    @Test
    public void turtleHasAPenTest(){
       Pen pen = turtle.getPen();
       assertNotNull(pen);
    }
    @Test
    public void penIsUpByDefaultTest(){
        Pen pen = turtle.getPen();
        assertSame(pen.getState(),UP);
    }
    @Test
    public void turtleCanMovePenDownTest(){
        Pen pen = turtle.getPen();
        assertSame(pen.getState(),UP);
        turtle.penDown();
        assertSame(turtle.getPen().getState(),DOWN);
    }
    @Test
    public void turtleCanMovePenUpTest(){
        turtle.penDown();
        assertSame(turtle.getPen().getState(),DOWN);
        turtle.penUp();
        assertSame(turtle.getPen().getState(),UP);
    }

    @Test
    public void turtleCanTurnRightWhileFacingEast(){
        assertSame(turtle.getCurrentDirection(),Direction.EAST);
    }
}
