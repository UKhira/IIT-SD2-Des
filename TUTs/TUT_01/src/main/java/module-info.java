module com.example.tut_01 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tut_01 to javafx.fxml;
    exports com.example.tut_01;
}