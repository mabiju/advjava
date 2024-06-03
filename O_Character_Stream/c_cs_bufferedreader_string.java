package O_Character_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c_cs_bufferedreader_string {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.println("Enter your name :");
        String name = br.readLine();
        System.out.println("Your name is :");
        System.out.println(name);
    }
}
