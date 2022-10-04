package core.learnjava.librarymanager.model;

import java.util.Comparator;

public class BookComparebyName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.name.compareTo(o2.name);
    }
}
