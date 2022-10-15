package core.learnjava.librarymanager.network;

import core.learnjava.librarymanager.model.Book;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

public class WebClient {
    public static void main(String ...arg){
        Socket clientSocket=new Socket();
        //String hostname="vietnamnet.vn";
        String hostname="antoanthongtin.vn";
        int port=80;
        InetSocketAddress endpoint=new InetSocketAddress(hostname,80);

        try {
            clientSocket.connect(endpoint);
            InputStream inputStream=clientSocket.getInputStream();
            OutputStream outputStream=clientSocket.getOutputStream();

            PrintWriter printerWriter=new PrintWriter(outputStream);

            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));

            printerWriter.println("GET / HTTP/1.1");
            printerWriter.println("Host: "+hostname);
            printerWriter.println("");
            printerWriter.flush();
            String s=null;

            while ((s=bufferedReader.readLine())!=null)
                System.out.println(s);


            //printerWriter.write();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
