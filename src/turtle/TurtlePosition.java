package turtle;

public class TurtlePosition {
private int row;
private int column;
    public TurtlePosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if(toBeCompared.getClass() != this.getClass()) return false;
        TurtlePosition compared = (TurtlePosition)toBeCompared;
        if(this.row == compared.row && this.column == compared.column){
            return true;
        }
        return false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "TurtlePosition{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
