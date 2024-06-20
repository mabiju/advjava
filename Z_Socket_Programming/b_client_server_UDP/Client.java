package Z_Socket_Programming.b_client_server_UDP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        try (
                DatagramSocket ds = new DatagramSocket()) {
            InetAddress ip = InetAddress.getLocalHost();
            byte buf[] = null;

            while (true) {
                String inp = sc.nextLine();

                buf = inp.getBytes();
                DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 5000);
                ds.send(DpSend);

                if (inp.equals("Over"))
                    break;
            }
        }
    }
}
