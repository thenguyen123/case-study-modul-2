package utils.Read;

import model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    public static List<Employee> readFile(String PATH) {
        List<Employee> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                Employee employee = new Employee(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7],
                        Long.parseLong(str[8]));
                list.add(employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        return list;
    }

}
