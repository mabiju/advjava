// java program to demonstrate the use of jva URLConnection class
package Z_Socket_Programming.c_URL;

import java.io.*;
import java.net.*;

public class b_url_conn {
    public static void main(String[] args) {
        try {
            URL u = new URI("https://www.hellomagazine.com/shopping/").toURL();
            URLConnection ucon = u.openConnection();
            InputStream s = ucon.getInputStream();

            int i;
            while ((i = s.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
