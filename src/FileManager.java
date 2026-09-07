import java.io.*;

public class FileManager {


    public void readAndWriteFile(String srcFile, String destFile) {
        Cipher cipher = new Cipher();

        try (BufferedReader br = new BufferedReader(new FileReader(srcFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {

            String line;
            while ((line = br.readLine()) != null){
                String cipheredStr = cipher.encrypt(line, 1);
                bw.write(cipheredStr);
                bw.write("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
