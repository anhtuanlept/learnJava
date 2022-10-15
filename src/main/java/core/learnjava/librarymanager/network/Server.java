package core.learnjava.librarymanager.network;

import core.learnjava.librarymanager.utils.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;

public class Server {
    public static void main(String ...arg){
        try {
            ServerSocket serverSocket=new ServerSocket();
            InetSocketAddress endpoitAddress=new InetSocketAddress("localhost",3456);
            ///System.out.println("Address "+serverSocket.getInetAddress().getHostAddress()+" Port: "+serverSocket.getLocalPort());

            serverSocket.bind(endpoitAddress);

            System.out.println("Server listening at Address "+serverSocket.getInetAddress().getHostAddress()+" Port: "+serverSocket.getLocalPort());
            while(true)
            {
                Socket socket=serverSocket.accept();
                System.out.println("Client connected at "+socket.getLocalAddress().getHostName()+" Port= "+socket.getPort()+" localPort "+socket.getLocalPort());
                InputStream inputStream=socket.getInputStream();
                OutputStream outputStream=socket.getOutputStream();
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);

                ///objectOutputStream.writeBytes("Server Hello");
                var listBook= Utils.getBookDataList();
                Collections.shuffle(listBook);
                objectOutputStream.writeObject(listBook);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
