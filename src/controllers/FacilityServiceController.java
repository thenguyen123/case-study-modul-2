package controllers;

import model.Facility;
import services.impl.FacilityServiceImpl;

import java.util.List;
import java.util.Map;

public class FacilityServiceController {
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public Map<Facility, Integer> addFacility() {
        return facilityService.addFacility();
    }


    public List<Facility> disPlay() {
        return facilityService.disPlay();
    }
}
