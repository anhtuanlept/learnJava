package core.learnjava.librarymanager.network;

import nl.altindag.ssl.SSLFactory;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class WebClientTLS {
    public static void main(String ...arg){
        //String hostname="antoanthongtin.vn";
        String hostname="vietnamnet.vn";
        int port=443;
        SSLSocketFactory factory= (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket clientSocket = null;
        try {
            clientSocket= (SSLSocket) factory.createSocket(hostname,port);

            String[] supported = clientSocket.getSupportedCipherSuites();
            clientSocket.setEnabledCipherSuites(supported);


            InputStream inputStream=clientSocket.getInputStream();
            OutputStream outputStream=clientSocket.getOutputStream();

            Writer printerWriter=new OutputStreamWriter(outputStream);

            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));

            printerWriter.write("GET http://" + hostname + "/ HTTP/1.1\r\n");
            printerWriter.write("Host: " + hostname + "\r\n");
            printerWriter.write("\r\n");
            printerWriter.flush();

            String s=null;

            while ((s=bufferedReader.readLine())!=null)
                System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
