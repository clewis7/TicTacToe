package View;

import Controller.ControllerImpl;
import Model.Model;
import Model.ModelImpl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher extends Application {
    @Override
    public void start(Stage stage) {
        ModelImpl model = new ModelImpl();
        ControllerImpl controller = new ControllerImpl(model);

        View view = new View(controller);

        Scene scene = new Scene(view.render());

        model.addObserver(
                (Model m) -> {
                    scene.setRoot(view.render());
                    stage.sizeToScene();
                });

        stage.setTitle("Tic-Tac-Toe");
        stage.show();
    }
}
