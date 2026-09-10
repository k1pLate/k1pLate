package Main;

import Main.Commands.*;
import java.util.Scanner;

public class MainApp {


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What you want to do?\n" +
                "1. Encrypt file\n" +
                "2. Decrypt file\n" +
                "3. Brute force\n" +
                "4. Statistical analyse\n" +
                "(1/2/3/4): ");

        int answer;
        do {
            answer = scanner.nextInt();
        } while (answer < 1 || answer > 4);

        scanner.nextLine();

        if (answer == 1) {
            new EncryptFile();
        }

        if  (answer == 2) {
            new DecryptFile();
        }
    }
}
