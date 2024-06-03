package O_Character_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_cs_bufferedreader_int {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number :");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("The number = " + num);
    }
}
