package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root=new Group();
        Button btn= new Button("Add");
        btn.setLayoutX(0);
        btn.setLayoutY(0);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                primaryStage.close();
            }
        });
        root.getChildren().add(btn);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
