package services.impl;

import model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
     List<Room> addRoom(Room room){
        List<Room> list=new ArrayList<>();
        list.add(room);
        return list;
     }

}
