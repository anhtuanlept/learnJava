package core.learnjava.librarymanager;

import core.learnjava.librarymanager.model.Book;
import core.learnjava.librarymanager.utils.Utils;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LibraryManager extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        var vbox=new VBox();
        var sc=new Scene(vbox,600,400);
        Book[] bookArr= Utils.getBookData();

        ListView listView=new ListView();
        listView.getSelectionModel().setSelectionMode((SelectionMode.SINGLE));
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(5));



        Button btnSearch=new Button("Search");



        TextField id=new TextField();
        TextField name=new TextField();
        TextField isbn=new TextField();

        btnSearch.setOnAction(event->{
            System.out.println("Button Search is Pressed!");
            Book book2Find=new Book(Integer.valueOf(id.getText()),name.getText(),isbn.getText());
            int pos=Utils.linearSearch(bookArr,book2Find);

            System.out.println(pos);

            listView.getSelectionModel().select(pos);

        });

        HBox hBox=new HBox();
        hBox.setSpacing(5);
        hBox.getChildren().addAll(btnSearch,id,name,isbn);

        vbox.getChildren().addAll(listView,hBox);

        listView.getItems().addAll(bookArr);




        primaryStage.setScene(sc);
        primaryStage.show();

    }
}
