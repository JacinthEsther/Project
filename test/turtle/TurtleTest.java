package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;
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
    public void turtleCanTurnRightWhileFacingEastTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(),SOUTH);
    }
    @Test
    public void turtleCanTurnRightWhileFacingSouthTest(){
        assertSame(turtle.getCurrentDirection(),EAST);
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST,turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightWhileFacingWestTest(){
        assertSame(turtle.getCurrentDirection(),EAST);
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH,turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightWhileFacingNorthTest(){
        assertSame(turtle.getCurrentDirection(),EAST);
      for (int turtleDirection = 0; turtleDirection < 4; turtleDirection++) {
          turtle.turnRight();
      }
        assertSame(EAST,turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveWhileFacingEastTest(){
    turtle.move(5);
   TurtlePosition expected = new TurtlePosition(0,4);
   assertEquals(expected, turtle.getTurtlePosition());
    }

@Test
    public void turtleCanMoveWhileFacingSouthTest(){
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        TurtlePosition expected = new TurtlePosition(4,4);
        assertEquals(expected, turtle.getTurtlePosition());
}



     @Test
    public void turtleCanMoveWhileFacingWest(){
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
    TurtlePosition expected = new TurtlePosition(4,0);
    assertEquals(expected, turtle.getTurtlePosition());
}
@Test
    public void turtleCanMoveWhileFacingNorthTest(){
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
        turtle.turnRight();
        turtle.move(5);
    TurtlePosition expected = new TurtlePosition(0,0);
    assertEquals(expected, turtle.getTurtlePosition());
}


}
