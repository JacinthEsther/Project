package turtle;

import javax.swing.text.Position;

import static turtle.Direction.*;

public class Turtle {
    private Direction currentDirection = EAST ;
    private TurtlePosition turtlePosition = new TurtlePosition(0,0);
    private Pen biro = new Pen();
    public Pen getPen() {
        return biro;
    }

    public void penDown() {
        biro.setState(PenState.DOWN);
    }

    public void penUp() {
        biro.setState(PenState.UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch(currentDirection){
            case EAST-> face(SOUTH);
            case SOUTH-> face(WEST);
            case WEST-> face(NORTH);
            case NORTH-> face(EAST);
        }
    }
    public void face(Direction currentDirection){
        this.currentDirection = currentDirection;
    }

    public void move(int noOfSteps) {
        if(currentDirection == EAST) increaseColumnBy(noOfSteps-1);
       else if(currentDirection == SOUTH) increaseRowBy(noOfSteps - 1);
       else if(currentDirection == WEST) decreaseColumnBy(noOfSteps - 1);
       else if(currentDirection == NORTH) decreaseRowBy(noOfSteps - 1);
    }

    private void increaseColumnBy(int increase) {
        turtlePosition.setColumn(turtlePosition.getColumn() + increase);
    }
     private void decreaseColumnBy(int decrease) {
        turtlePosition.setColumn(turtlePosition.getColumn() - decrease);
    }

    public TurtlePosition getTurtlePosition() {
        return turtlePosition;
    }
    private void increaseRowBy(int increase){
        int currentFlow = turtlePosition.getRow();
        turtlePosition.setRow(currentFlow + increase);
    }
    private void decreaseRowBy(int decrease){
        int currentFlow = turtlePosition.getRow();
        turtlePosition.setRow(currentFlow - decrease);
    }

    public void turnLeft() {
        switch(currentDirection){
            case EAST-> face(NORTH);
            case SOUTH-> face(EAST);
            case WEST-> face(SOUTH);
            case NORTH-> face(WEST);
        }
    }
}
