package services.impl;

import model.Facility;
import model.Room;
import model.Villa;
import services.IFacilityService;

import utils.Read.ReadFileRoom;
import utils.Read.ReadVillaFile;

import utils.Write.WriteFileRoom;
import utils.Write.WriteVillaFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {

public  static  final String FILEROOM ="src/data/room.csv";
public static final String FILEVILLA="src/data/room.csv";

    @Override
    public Map<Facility, Integer> addFacility() {

        return null;
    }
    @Override
    public List<Facility> disPlay() {
        return null;
    }
public  void addRoom(Room room){
    WriteFileRoom.writeFile(FILEROOM,room);

}public void addVilla(Villa villa){
        WriteVillaFile.writeFile(FILEVILLA,villa);
    }

    public   Map<Room,Integer>  toStringRoom(){
        Map<Room,Integer> map=  ReadFileRoom.readFile(FILEROOM);
        return map;
    }
    public   Map<Villa,Integer>  toStringVilla(){
        Map<Villa,Integer> map=  ReadVillaFile.readFile(FILEVILLA);
        return map;
    }
}
