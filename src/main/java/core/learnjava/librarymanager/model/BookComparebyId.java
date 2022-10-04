package core.learnjava.librarymanager.model;

import java.util.Comparator;

public class BookComparebyId implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
       if(o1.id==o2.id) return 0;
       else if(o1.id<o2.id) return -1;
       else return 1;
    }
}
