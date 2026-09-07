import java.util.Scanner;

public class MainApp {
    static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();

        String srcFile;

        do {
            System.out.print("Enter source file name: ");
            srcFile = scanner.nextLine();
        } while (!validator.isFileExists(srcFile));

        fileManager.readAndWriteFile(srcFile, "files/ENCRYPTED_FILE.txt");
    }
}
