package core.learnjava.librarymanager.network;

import core.learnjava.librarymanager.model.Book;
import core.learnjava.librarymanager.utils.Utils;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

public class Client {
    public static void main(String ...arg){
        Socket clientSocket=new Socket();
        InetSocketAddress endpoint=new InetSocketAddress("localhost",3456);
        System.out.println("Trang thai ket noi den server: "+clientSocket.isConnected()+" Port: "+clientSocket.getLocalPort());
        try {
            clientSocket.connect(endpoint);
            System.out.println("Trang thai ket noi den server: "+clientSocket.isConnected()+" Port: "+clientSocket.getLocalPort());
            //while(true)
            //{
                InputStream inputStream=clientSocket.getInputStream();
                OutputStream outputStream=clientSocket.getOutputStream();
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);

                ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
                System.out.println("Du lieu nhan duoc tu server: ");
                //System.out.println(objectInputStream.readUTF());
                var listData=(ArrayList<Book>)objectInputStream.readObject();
                System.out.println(listData);
            //}


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
