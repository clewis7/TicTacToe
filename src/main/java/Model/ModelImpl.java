package Model;

import java.util.ArrayList;
import java.util.List;

public class ModelImpl implements Model {
  private List<ModelObserver> observers;
  private Board board;
  private boolean isWon;

  public ModelImpl() {
    this.board = new Board();
    this.observers = new ArrayList<>();
    this.isWon = isWon();
  }

  /** Adds a 'X' to the board in a given row and column. */
  public void addX(int r, int c) {
      this.board.setValue(r, c, 1);
    for (ModelObserver observer : this.observers) {
      observer.update(this);
    }
  }

  /** Adds a 'O' to the board in a given row and column. */
  public void addO(int r, int c) {
    this.board.setValue(r, c, 0);
    for (ModelObserver observer : this.observers) {
      observer.update(this);
    }
  }

  public int getCellValue (int r, int c) {
    return getCellValue(r, c);
  }

  /** Clears the game board, removing all X's and O's. */
  public void resetGame() {
    this.board = new Board();
    for (ModelObserver observer : this.observers) {
      observer.update(this);
    }
  }

  /** Checks to see if someone has won the game. */
  public boolean isWon() {
    return true;
  }

  /** Makes sure that move made was valid. i.e. an X is followed by and O etc. */
  public boolean validTurn() {
    return true;
  }

  /** Adds an observer to the model */
  public void addObserver(ModelObserver observer) {
    this.observers.add(observer);
  }

  /** Removes an observer from the model */
  public void removeObserver(ModelObserver observer) {
    this.observers.remove(observer);
  }
}
