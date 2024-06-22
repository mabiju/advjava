// java program to illustrate client side implementation using DatagramSocket
package Z_Socket_Programming.b_client_server_UDP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        try (
            // Step 1: Create the socket object for carrying the data
            DatagramSocket ds = new DatagramSocket()) {
            InetAddress ip = InetAddress.getLocalHost();
            byte buf[] = null;

            // loop while user not enters "Over"
            while (true) {
                String inp = sc.nextLine();

                // convert the String input into the byte array
                buf = inp.getBytes();

                // Step 2: Create the datagramPacket for sending the data
                DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 5000);

                // Step 3: Execute the send call to actually send the data
                ds.send(DpSend);

                // break the loop is user enters "Over"
                if (inp.equals("Over"))
                    break;
            }
        }
    }
}
