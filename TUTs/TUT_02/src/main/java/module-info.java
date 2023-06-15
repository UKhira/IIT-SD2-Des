module tut02.tut_02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens tut02.tut_02 to javafx.fxml;
    exports tut02.tut_02;
}