package case_study.repository;

import case_study.model.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> getFacilityMap();

    void addNewFacility(Facility facility);
}
