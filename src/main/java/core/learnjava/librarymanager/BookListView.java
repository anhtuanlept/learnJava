package core.learnjava.librarymanager;

import core.learnjava.librarymanager.model.Book;
import core.learnjava.librarymanager.utils.Utils;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Arrays;

public class BookListView extends VBox {
    public BookListView()
    {
        var vbox=new VBox();

        Book[] bookArr= Utils.getBookData();
        //ArrayList<Book> listBook=Utils.getBookDataList();

        ListView listView=new ListView();
        listView.getSelectionModel().setSelectionMode((SelectionMode.SINGLE));
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(5));

        Arrays.sort(bookArr);


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

        getChildren().addAll(vbox);
    }
}
