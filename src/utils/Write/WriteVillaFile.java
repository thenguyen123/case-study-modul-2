package utils.Write;

import model.Room;
import model.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteVillaFile {
    public static void writeFile(String PATH, Villa villa) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(villa.csv());
            bufferedWriter.newLine();
            bufferedWriter.flush();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
