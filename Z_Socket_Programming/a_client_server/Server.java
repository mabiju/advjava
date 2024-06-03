// java program for server
package Z_Socket_Programming.a_client_server;

import java.net.*;
import java.io.*;

public class Server {
    // initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    // constructor with port
    public Server(int port)
    {
        // starts the server and waits for connection
        try {
            server = new ServerSocket(port);
            System.out.println("Server Started");
            System.out.println("Waiting for client.......");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
