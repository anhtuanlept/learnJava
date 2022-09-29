module core.learnjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens core.learnjava to javafx.fxml;
    opens core.learnjava.librarymanager to javafx.fxml;
    exports core.learnjava.librarymanager;
    exports core.learnjava;

}