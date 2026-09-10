package Main.Commands;

import Main.FileManager;
import Main.Validator;

import java.util.Scanner;

public class DecryptFile {
    FileManager fileManager = new FileManager();
    Scanner scanner = new Scanner(System.in);
    Validator validator = new Validator();

    String encryptedFile;
    int key = 0;

    public DecryptFile() {
        do {
            System.out.print("Enter source file name you want to decrypt: ");
            encryptedFile = scanner.nextLine();
        } while (validator.isFileExists(encryptedFile));

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

        fileManager.readAndWriteFile(encryptedFile, "files/DECRYPTED_FILE.txt", key, 2);
    }
}
