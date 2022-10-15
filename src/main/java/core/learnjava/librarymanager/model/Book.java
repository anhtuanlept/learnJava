package core.learnjava.librarymanager.model;
import java.io.Serializable;

public class Book implements Comparable<Book>,Serializable{//2 cach kiem soat truy nhap la public
    int id;
    String name;
    String ISBN;

    public Book(int id, String name, String ISBN) {
        this.id = id;
        this.name = name;
        this.ISBN = ISBN;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString()
    {

        return id+" "+name+" "+ISBN;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Book)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Book c = (Book) o;

        // Compare the data members and return accordingly
        return (this.id==(c.id)&&(this.name.equals(c.name))&&(c.ISBN.equals(this.ISBN)));
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}
