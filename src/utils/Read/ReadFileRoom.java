package utils.Read;

import model.Employee;
import model.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFileRoom {
    public static Map<Room,Integer> readFile(String PATH) {
      Map<Room,Integer> map=new HashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                Room room = new Room(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]),
                        Integer.parseInt(str[3]), str[4], str[5]);
              map.put(room,0);
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
        return map;
    }
}
