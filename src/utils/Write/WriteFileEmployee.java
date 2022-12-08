package utils.Write;

import model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployee {
    public static void writeFile(String PATH, List<Employee> list) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : list) {
                bufferedWriter.write(employee.csv());
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
