package turtle;

public class Turtle {
  private Pen biro = new Pen();
    public Pen getPen() {
        return biro;
    }

    public void penDown() {
        biro.setState(PenState.DOWN);
    }
}