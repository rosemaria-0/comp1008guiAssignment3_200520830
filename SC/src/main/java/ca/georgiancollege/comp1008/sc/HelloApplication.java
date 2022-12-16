package ca.georgiancollege.comp1008.sc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seating_Chart.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Seating Chart");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();

    }
}