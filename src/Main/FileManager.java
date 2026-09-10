package Main;

import java.io.*;

public class FileManager {


    public void readAndWriteFile(String srcFile, String destFile, int key, int mode) {
        Cipher cipher = new Cipher();

        try (BufferedReader br = new BufferedReader(new FileReader(srcFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                String stringToWrite = "";
                if (mode == 1) {
                    stringToWrite = cipher.encrypt(line, key);
                }
                if (mode == 2) {
                    stringToWrite = cipher.decrypt(line, key);
                }
                bw.write(stringToWrite);
                bw.write("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
