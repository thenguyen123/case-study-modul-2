package utils.Read;

import model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Map;

public class FacilityFileRead {
    public void readFacility(String PATH) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (Exception e) {

        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

