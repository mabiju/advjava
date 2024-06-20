package Z_Socket_Programming.b_client_server_UDP;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        try (DatagramSocket ds = new DatagramSocket(5000)) {
            byte[] receive = new byte[65535];

            DatagramPacket DpRecieve = null;
            while (true) {
                DpRecieve = new DatagramPacket(receive, receive.length);
                ds.receive(DpRecieve);

                System.out.println("Client says: " + data(receive));

                if (data(receive).toString().equals("Over")) {
                    System.out.println("Client wants to exit from the app");
                    break;
                }
                receive = new byte[65535];
            }
        }
    }

    public static StringBuilder data(byte[] a) {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
