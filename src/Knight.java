
public class Knight {

    int [] horizontal = {2,1,-1,-2,-2,-1,1,2};
    int currentRow = 3;
    int currentColumn = 4;
    int[] vertical = {-1,-2,-2,-1,1,2,2,1};
    int[][] board = new int[8][8];
    int count = 1;

    public void move(int moveNumber) {

       currentRow += vertical[moveNumber] ;
       currentColumn += horizontal[moveNumber] ;
    if(currentColumn > board[currentRow].length ||
        currentRow > board[currentColumn].length){throw new ArrayIndexOutOfBoundsException();}
        board[currentRow][currentColumn] = count++;
    }


    public int [][] getPosition() {
        return board;
    }
}
