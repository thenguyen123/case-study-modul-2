package utils.Write;

import model.Customer;
import model.Facility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class WriteFacility {
    public static void writeFile(String PATH, Map<Facility,Integer> map) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
                String str = entry.getValue() + "" + entry.getKey();
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
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
