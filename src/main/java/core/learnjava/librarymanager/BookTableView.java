package core.learnjava.librarymanager;

import core.learnjava.librarymanager.model.Book;
import core.learnjava.librarymanager.utils.Utils;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BookTableView extends VBox {
    public BookTableView()
    {
        ArrayList<Book> arrayList= Utils.getBookDataList();

        TableView<Book> tableView=new TableView<>();
        TableColumn<Book,String> idColum=new TableColumn<>("ID");
        TableColumn<Book,String> nameColum=new TableColumn<>("Name");
        TableColumn<Book,String> isbnColum=new TableColumn<>("ISBN");
        tableView.getColumns().addAll(idColum,nameColum,isbnColum);

        idColum.setCellValueFactory(new PropertyValueFactory<Book, String>("id"));
        nameColum.setCellValueFactory(new PropertyValueFactory<Book, String>("name"));
        isbnColum.setCellValueFactory(new PropertyValueFactory<Book, String>("ISBN"));
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Collections.shuffle(arrayList);


        tableView.getItems().addAll(arrayList);

        Button btnShuffle=new Button("Xáo");
        Button selectShort=new Button("Xắp xếp chọn");
        Button insertShort=new Button("Xắp xếp chèn");



        getChildren().addAll(tableView);


    }
}
