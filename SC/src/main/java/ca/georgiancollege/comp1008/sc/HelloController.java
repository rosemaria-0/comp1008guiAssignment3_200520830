package ca.georgiancollege.comp1008.sc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.util.Random;
import java.util.Scanner;

public class HelloController {

    @FXML
    private Label TEACHER;
    @FXML
    private ColorPicker ColorPicker;

    @FXML
    protected void onHelloButtonClick() {
        TEACHER.setText("Welcome to JavaFX Application!");}
    @FXML
    private Text msg;

    @FXML
    private Text A;

    @FXML
    private Text B;

    @FXML
    private Text C;

    @FXML
    private Text D;

    @FXML
    private Text E;

    @FXML
    private Text F;

    @FXML
    private Text G;

    @FXML
    private Text H;

    @FXML
    private Text I;

    @FXML
    private Button placeButton;

    @FXML
    private Pane Seat1;

    @FXML
    private Pane Seat2;

    @FXML
    private Pane Seat3;

    @FXML
    private Pane Seat4;

    @FXML
    private Pane Seat5;

    @FXML
    private Pane Seat6;

    @FXML
    private Pane Seat7;

    @FXML
    private Pane Seat8;

    @FXML
    private Pane Seat9;

    @FXML
    private TextField StudentName;

    @FXML
    void onButtonAction (ActionEvent event) {

    }
    public  void Seating(){
        Scanner sc = new Scanner(System.in);
        String[] Names = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        Random random = new Random();
        int select = random.nextInt(Names.length);
    }




}