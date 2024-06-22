package Z_Socket_Programming.c_URL;
import java.net.*;

public class a_urldemo {
    public static void main(String[] args) {
        try {
            // URL u = new URI("https://google.com/user").toURL();
            URL u = new URI("https://secure.site:9000/login").toURL();
            System.out.println("Protocol = " + u.getProtocol());
            System.out.println("Portnumber = " + u.getPort());
            System.out.println("File = " + u.getFile());
            System.out.println("Host name = " + u.getHost());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
