/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Richard
 */
public class Reloj extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("reloj_fxml.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Formulari Avançat");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
