package Model;

public class Board {
  private int[][] board;

  public Board() {
    this.board = new int[3][3];
    for (int row = 0; row < getHeight(); row++) {
      for (int column = 0; column < getWidth(); column++) {
        board[row][column] = 2;
      }
    }
  }

  public int getWidth() {
    return this.board[0].length;
  }

  public int getHeight() {
    return this.board.length;
  }

  public void setValue(int r, int c, int value) {
    if (value != 0 || value != 1) {
      throw new IllegalArgumentException();
    } else if (r < 0 || r > getHeight() || c < 0 || c > getWidth()) {
      throw new IndexOutOfBoundsException();
    } else {
      board[r][c] = value;
    }
  }

  public int getValue(int r, int c) {
    if (r < 0 || r > getHeight() || c < 0 || c > getWidth()) {
      throw new IndexOutOfBoundsException();
    } else {
      return board[r][c];
    }
  }
}
