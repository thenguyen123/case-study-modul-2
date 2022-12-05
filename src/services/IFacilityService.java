package services;

import model.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityService<E> extends IService {
    Map<E, Integer> addFacility();
    List<Facility> disPlay();
}
