package Controller;

import Model.Model;

public class ControllerImpl implements Controller {
    private Model model;

    public ControllerImpl(Model model) {
        this.model = model;
    }


    /** Handles the click event on the cell at row r, column c */
    public void clickCell(int r, int c) {
        if (this.model.getCellValue(r,c) == 2) {
            // add X or O depending on turn
        } else {
            // should not be able to click now
        }
        // should be able to simply add X or O depending on turn, and then click capability of cell go away
    }

    /** Handles the click action to reset the currently active puzzle */
    public void clickResetBoard() {
        this.model.resetGame();
    }
}
