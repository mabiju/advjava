package O_Character_Stream;

import java.io.*;

public class e_cs_bufferedWriter_string {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\SCAJAVAM1\\O_Character_Stream\\z_filename.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello Sanothimi");
        bw.close();
        System.out.println("The text has been written to a file successfully.");
    }
}
