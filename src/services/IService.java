package services;

import model.Facility;

import java.util.List;
import java.util.Map;

public interface IService <E> {
   List<E> disPlay() ;
   default Map<E, Integer> addFacility() {
      return null;
   }

}
