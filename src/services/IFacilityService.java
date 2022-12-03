package services;

import model.Facility;

import java.util.List;

public interface IFacilityService extends IService {
    @Override
    List<Facility> disPlay();
    void addFacility(Facility facility);
    void facilityMaintenance();
}
