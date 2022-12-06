package utils.Write;

import model.Employee;
import model.Room;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileRoom {
    public static void writeFile(String PATH, List<Room> list) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room: list) {
                bufferedWriter.write(room.csv());
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
