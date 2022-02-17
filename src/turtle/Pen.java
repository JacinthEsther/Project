package turtle;

public class Pen {

    private PenState penState = PenState.UP;

    public PenState getState() {
        return penState;
    }

    public void setState(PenState penState) {
        this.penState = penState;
    }
}
