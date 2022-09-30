package core.learnjava.librarymanager.utils;

import core.learnjava.librarymanager.model.Book;

public class Utils {
    public static Book[] getBookData()
    {
        Book[] bookArray=new Book[5];
        bookArray[0]=new Book(1,"Old man and Sea","2432-4423");
        bookArray[1]=new Book(2,"War and Peace","1432-8423");
        bookArray[2]=new Book(3,"Tay Du Ky","3432-8423");
        bookArray[3]=new Book(4,"Tam Quoc Dien Nghia","7432-9423");
        bookArray[4]=new Book(5,"Hong Lau Mong","7432-9423");
        return bookArray;
    }

    public static int linearSearch(Book[] data,Book key){
        boolean flag=false;
        int pos=-1;
        for(int i=0;i<data.length;i++)
        {
            if(data[i].equals(key)) {
                flag = true;
                pos=i;
                break;
            }
        }
        return  pos;

    }

    public static long factorial(long n)
    {
        if(n==1) return 1;
        return n*factorial(n-1);
    }


}
