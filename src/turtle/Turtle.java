package turtle;

import java.util.Arrays;

import static turtle.Direction.*;

public class Turtle {
    private Direction currentDirection = EAST ;
    private final TurtlePosition turtlePosition = new TurtlePosition(0,0);
    private final Pen biro = new Pen();
    private String[][] array;

    public Turtle(String[][] array){
        for (String[] strings : array) {
            Arrays.fill(strings, " ");
        }
        this.array = array;
    }

//    private Sketchpad sketchpad = new Sketchpad(array);

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
        if(!(turtlePosition.getColumn() + increase > array.length)) {

            turtleCanDrawByIncreasingColumnMovingEast(increase);
            turtlePosition.setColumn(turtlePosition.getColumn() + increase);
        }
        else{
            throw new InvalidSketchpadException("Turtle has fallen off the cliff");
        }
    }
     private void decreaseColumnBy(int decrease) {
         if(!(turtlePosition.getColumn() - decrease < 0)) {
         turtleCanDrawByDecreasingColumnMovingWest(decrease);
         turtlePosition.setColumn(turtlePosition.getColumn() - decrease);
         }
         else{
             throw new InvalidSketchpadException("Turtle has fallen off the cliff");
         }
    }

    private void turtleCanDrawByDecreasingColumnMovingWest(int decrease) {
        if (validatePenIsDown()){
        turtleCanDrawByIncreasingRowMovingSouth(decrease);
        for (int i = 4; i < 5 ; i++) {
            for (int j = decrease; j >= 0 ; j--) {
                array[i][j] = "-";
            }
        }
        }
    }


    private void turtleCanDrawByIncreasingColumnMovingEast(int increase){
       if (validatePenIsDown()){
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j <= increase; j++) {
                array[i][j] = "-";
            }
        }
        }
    }
    private boolean validatePenIsDown() {
        return getPen().getState() == PenState.DOWN;
    }
    private void turtleCanDrawByIncreasingRowMovingSouth(int increase){
        if (validatePenIsDown()){
        turtleCanDrawByIncreasingColumnMovingEast(increase);
        for (int i = 0; i <= increase; i++) {
            for (int j = 4; j < 5; j++) {
                array[i][j] = "-";
            }
        }
    }
    }

    public TurtlePosition getTurtlePosition() {
        return turtlePosition;
    }
    private void increaseRowBy(int increase){
        if(!(turtlePosition.getRow() + increase > array.length)) {
        turtleCanDrawByIncreasingRowMovingSouth(increase);
        int currentFlow = turtlePosition.getRow();
        turtlePosition.setRow(currentFlow + increase);
        }
        else{
            throw new InvalidSketchpadException("Turtle has fallen off the cliff");
        }
    }
    private void decreaseRowBy(int decrease){
        if(!(turtlePosition.getRow() - decrease < 0)) {
            turtleCanDrawByDecreasingRowWhileMovingNorth(decrease);
            int currentFlow = turtlePosition.getRow();
            turtlePosition.setRow(currentFlow - decrease);
        }
        else{
                throw new InvalidSketchpadException("Turtle has fallen off the cliff");
            }
    }

    private void turtleCanDrawByDecreasingRowWhileMovingNorth(int decrease) {
        if (validatePenIsDown()){
        turtleCanDrawByDecreasingColumnMovingWest(decrease);
        for (int i = decrease; i >= 0; i--) {
            for (int j = 0; j < 1 ; j++) {
                array[i][j] = "-";
            }
        }
    }
    }

    public void turnLeft() {
        switch(currentDirection){
            case EAST-> face(NORTH);
            case NORTH-> face(WEST);
            case WEST-> face(SOUTH);
            case SOUTH-> face(EAST);
        }
    }

    public String [][] getTurtleArray() {
        return array;
    }
}
