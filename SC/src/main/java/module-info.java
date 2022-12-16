module ca.georgiancollege.comp1008.sc {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1008.sc to javafx.fxml;
    exports ca.georgiancollege.comp1008.sc;
}