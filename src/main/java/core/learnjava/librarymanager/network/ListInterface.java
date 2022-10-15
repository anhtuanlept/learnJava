package core.learnjava.librarymanager.network;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ListInterface {
    public static void main(String ...arg) throws SocketException, UnknownHostException {
        /*for(var i:java.net.NetworkInterface.networkInterfaces().toList())
            System.out.println(i.getDisplayName());*/
        InetAddress address=InetAddress.getLocalHost();
        System.out.println(address.getHostAddress());

        InetAddress address1=InetAddress.getByName("vietnamnet.vn");
        System.out.println(address1.getHostAddress());

        InetAddress address2=InetAddress.getByName("google.com.vn");
        System.out.println(address2.getHostAddress());

    }
}
