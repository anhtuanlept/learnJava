module core.learnjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.management;
    requires java.logging;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;
    requires org.json;
    requires io.github.hakky54.sslcontext.kickstart;
    requires java.xml.bind;


    opens core.learnjava to javafx.fxml;
    opens app.controllers to  javafx.fxml;
    opens core.learnjava.librarymanager to javafx.fxml;
    opens core.learnjava.librarymanager.model to javafx.base;
    opens json to com.fasterxml.jackson.databind;
    exports app.stdlib;
    exports core.learnjava.librarymanager;
    exports core.learnjava;
    exports app.controllers;
    exports app;
    exports app.myui;
    opens app.myui to javafx.fxml;

}