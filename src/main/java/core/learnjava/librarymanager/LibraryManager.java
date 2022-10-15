package core.learnjava.librarymanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class LibraryManager extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BookListView listView=new BookListView();
        BookTableView tableView=new BookTableView();


        MenuBar menuBar=new MenuBar();
        Menu fileMenu=new Menu("File");
        MenuItem viewBook=new MenuItem("DS Book");
        MenuItem viewBookTable=new MenuItem("Book Table");

        MenuItem closeView=new MenuItem("Close View");

        fileMenu.getItems().addAll(viewBook,closeView,viewBookTable);
        menuBar.getMenus().addAll(fileMenu);


        var vbox=new VBox();

        vbox.setSpacing(5);
        vbox.setPadding(new Insets(5));



        var sc=new Scene(vbox,600,400);

        HBox hBox=new HBox();
        vbox.getChildren().addAll(menuBar,hBox);

        viewBook.setOnAction(e->{
            hBox.getChildren().add(listView);
        });
        closeView.setOnAction(e->
        {
            if(hBox.getChildren().contains(listView))
                hBox.getChildren().remove(listView);

            if(hBox.getChildren().contains(tableView))
                hBox.getChildren().remove(tableView);
        });
        viewBookTable.setOnAction(e->{
            hBox.getChildren().add(tableView);
        });




        primaryStage.setScene(sc);
        primaryStage.show();

    }
}
