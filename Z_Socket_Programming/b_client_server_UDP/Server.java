// java program to demonstrate server sied implementation using DatagramSocket
package Z_Socket_Programming.b_client_server_UDP;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        try (
            // Step 1: Create a socket to listen at port 5000
            DatagramSocket ds = new DatagramSocket(5000)) {
            byte[] receive = new byte[65535];

            DatagramPacket DpRecieve = null;
            while (true) {
                // Step 2: Create a DatagramPacket to receive the data
                DpRecieve = new DatagramPacket(receive, receive.length);

                // Step 3: recieve the data in byte buffer
                ds.receive(DpRecieve);

                System.out.println("Client says: " + data(receive));

                // Exit the server if the client sends "Over"
                if (data(receive).toString().equals("Over")) {
                    System.out.println("Client wants to exit from the app");
                    break;
                }

                // Clear the buffer after every message.
                receive = new byte[65535];
            }
        }
    }

    // method to convert the byte array data into a string representation
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
