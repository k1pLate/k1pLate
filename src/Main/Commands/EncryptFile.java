package Main.Commands;

import Main.FileManager;
import Main.Validator;

import java.util.Scanner;

public class EncryptFile {
    FileManager fileManager = new FileManager();
    Scanner scanner = new Scanner(System.in);
    Validator validator = new Validator();

    String srcFile;
    int key = 0;

    public EncryptFile() {
        do {
            System.out.print("Enter source file name: ");
            srcFile = scanner.nextLine();
        } while (validator.isFileExists(srcFile));

        System.out.print("Enter a key: ");

        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid key entered. Please try again: ");
                scanner.next();
            }
            key = scanner.nextInt();
            if (key == 0) {
                System.out.print("Key couldn't be 0. Please try again: ");
            }
        } while (!(key > 0 && key < Integer.MAX_VALUE));

        fileManager.readAndWriteFile(srcFile, "files/ENCRYPTED_FILE.txt", key, 1);
    }
}
