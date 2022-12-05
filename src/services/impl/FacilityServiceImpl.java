package services.impl;

import model.Facility;
import services.IFacilityService;
import views.RoomView;
import views.VillaView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    List<Facility>list =new ArrayList<>();
    Map<Facility, Integer> map = new LinkedHashMap<>();

    @Override
    public Map<Facility, Integer> addFacility() {
        return map;
    }
    @Override
    public List<Facility> disPlay() {
        return list;
    }

}
