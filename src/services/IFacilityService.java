package services;

import model.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityService<E> extends IService {
    @Override
    Map<E, Integer> addFacility();
    @Override
    List<Facility> disPlay();

}
