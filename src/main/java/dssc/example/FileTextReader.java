package dssc.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTextReader implements TextReader {

    private final BufferedReader reader;

    public FileTextReader(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    @Override
    public String readLine() throws IOException {
        return reader.readLine();
    }
}
