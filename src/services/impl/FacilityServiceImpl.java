package services.impl;

import model.Facility;
import services.IFacilityService;

import java.util.ArrayList;
import java.util.List;

public class FacilityServiceImpl implements IFacilityService {
List<Facility> list=new ArrayList<>();
    @Override
    public List<Facility> disPlay() {
        return list;
    }

    @Override
    public void addFacility(Facility facility) {
list.add(facility);
    }
    @Override
    public void facilityMaintenance() {

    }
}
