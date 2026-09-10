package Main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Validator {

    public boolean isFileExists(String filePath) {
        Path path = Paths.get(filePath);

        if (!Files.exists(path)) {
            System.out.println("File does not exist!");
            return true;
        } else  {
            return false;
        }
    }
}
