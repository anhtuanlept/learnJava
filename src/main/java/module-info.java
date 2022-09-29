module core.learnjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens core.learnjava to javafx.fxml;
    exports core.learnjava;
}