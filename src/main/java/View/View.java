package View;

import Controller.ControllerImpl;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

public class View implements FXComponent{

    private final ControllerImpl controller;

    public View(ControllerImpl controller) {
        this.controller = controller;
    }

    @Override
    public Parent render() {
        VBox layout = new VBox();
        return layout;
    }
}
