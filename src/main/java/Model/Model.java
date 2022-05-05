package Model;

public interface Model {

    /**
     * Adds a 'X' to the board in a given row and column.
     */
    void addX(int r, int c);

    /**
     * Adds a 'O' to the board in a given row and column.
     */
    void addO(int r, int c);

    /**
     * Clears the game board, removing all X's and O's.
     */
    void resetGame();

    /**
     * Checks to see if someone has won the game.
     */
    boolean isWon();

    /**
     * Returns and int corresponding to whether a cell is empty, or filled with an X or O.
     * Return value of 2 = empty.
     * Return value of 0 = O.
     * Return value of 1 = X.
     */
    int getCellValue (int r, int c);

    /**
     * Makes sure that move made was valid. i.e. an X is followed by and O etc.
     */
    boolean validTurn();

    /** Adds an observer to the model */
    void addObserver(ModelObserver observer);

    /** Removes an observer from the model */
    void removeObserver(ModelObserver observer);


}
