module com.example.selfstud {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.selfstud to javafx.fxml;
    exports com.example.selfstud;
}