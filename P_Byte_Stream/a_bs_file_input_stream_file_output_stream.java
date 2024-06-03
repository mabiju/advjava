package P_Byte_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class a_bs_file_input_stream_file_output_stream {
    public static void main(String[] args) throws Exception {
        File filein = new File("D:/SCAJAVAM1/P_Byte_Stream/sita.txt");
        FileInputStream fis = new FileInputStream(filein);
        byte bytes[] = new byte[(int) filein.length()];
        fis.read(bytes);

        File fileout = new File("D:/SCAJAVAM1/P_Byte_Stream/ram.txt");
        FileOutputStream fos = new FileOutputStream(fileout);
        fos.write(bytes);
        fos.flush();
        System.out.println("Data has been written successfully.");

        fis.close();
        fos.close();
    }
}
