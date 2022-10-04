module core.learnjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.management;


    opens core.learnjava to javafx.fxml;
    opens core.learnjava.librarymanager to javafx.fxml;
    opens core.learnjava.librarymanager.model to javafx.base;
    exports core.learnjava.stdlib;
    exports core.learnjava.librarymanager;
    exports core.learnjava;

}