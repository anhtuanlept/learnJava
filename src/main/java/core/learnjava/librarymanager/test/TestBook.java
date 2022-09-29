package core.learnjava.librarymanager.test;

//import core.learnjava.librarymanager.model.Book;

import core.learnjava.librarymanager.model.Book;
import core.learnjava.librarymanager.utils.Utils;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBook {
    public static void main(String ...args){
        core.learnjava.librarymanager.model.Book v=new core.learnjava.librarymanager.model.Book();

        /*System.out.println(Utils.factorial(1));
        System.out.println(Utils.factorial(2));
        System.out.println(Utils.factorial(3));
        System.out.println(Utils.factorial(4));
        System.out.println(Utils.factorial(5));
        System.out.println(Utils.factorial(6));*/
        Book[] bookArr= Utils.getBookData();

        System.out.println("DS books truoc sap xep:");
        for (var i:bookArr)
            System.out.println(i.getName());


        Arrays.sort(bookArr);


        System.out.println("DS books sau xap xep:");
        for (var i:bookArr)
            System.out.println(i.getName());

        //Arrays.sort();

        //v.
    }
}
