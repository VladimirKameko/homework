package IO;

import java.io.File;
import java.io.IOException;

public class TestReaderWriter {
    public static void main(String[] args) throws IOException {
        System.out.println(new ReaderWriter().readAndWrite(new File("C:\\gitproject\\homework\\src\\IO", "\\in.txt"), new File("C:\\gitproject\\homework\\src\\IO", "\\out.txt")));
    }
}
