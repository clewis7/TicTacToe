package Controller;

public interface Controller {
    /** Handles the click event on the cell at row r, column c */
    void clickCell(int r, int c);

    /** Handles the click action to reset the board */
    void clickResetBoard();
}
