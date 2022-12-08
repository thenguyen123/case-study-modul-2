package controllers;

import model.Facility;
import model.Room;
import model.Villa;
import services.impl.FacilityServiceImpl;

import java.util.List;
import java.util.Map;

public class FacilityServiceController {
  private final   FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public Map<Facility, Integer> addFacility() {
        return facilityService.addFacility();
    }public  void addRoom(Room room){
        facilityService.addRoom(room);
    }public  void addVilla(Villa villa){
        facilityService.addVilla(villa);
    }


    public List<Facility> disPlay() {
        return facilityService.disPlay();
    }  public   Map<Villa,Integer>  toStringVilla(){
        return facilityService.toStringVilla();
    }public   Map<Room,Integer>  toStringRoom(){
        return facilityService.toStringRoom();
    }
}
