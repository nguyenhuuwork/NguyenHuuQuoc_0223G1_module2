package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        Villa villa1 = new Villa("SVVL-0001", "PoolVilla", 450.20, 15, 8, "Day", "Normal", 45, 1);
        Villa villa2 = new Villa("SVVL-0002", "PoolVilla", 450.20, 15, 8, "Day", "Normal", 45, 1);
        Villa villa3 = new Villa("SVVL-0003", "PoolVilla", 450.20, 15, 8, "Day", "Normal", 45, 1);
        House house1 = new House("SVHO-0001", "PoolHouse", 450.20, 15, 8, "Day", "Normal", 1);
        House house2 = new House("SVHO-0002", "PoolHouse", 450.20, 15, 8, "Day", "Normal", 1);
        House house3 = new House("SVHO-0003", "PoolHouse", 450.20, 15, 8, "Day", "Normal", 1);
        Room room1 = new Room("SVRO-0001", "Room", 450.20, 15, 8, "Day", "Normal");
        Room room2 = new Room("SVRO-0002", "Room", 450.20, 15, 8, "Day", "Normal");
        Room room3 = new Room("SVRO-0003", "Room", 450.20, 15, 8, "Day", "Normal");
        facilityMap.put(villa1, 0);
        facilityMap.put(villa2, 0);
        facilityMap.put(villa3, 0);
        facilityMap.put(house1, 0);
        facilityMap.put(house2, 0);
        facilityMap.put(house3, 0);
        facilityMap.put(room1, 0);
        facilityMap.put(room2, 0);
        facilityMap.put(room3, 0);
    }

    @Override
    public Map<Facility, Integer> getFacilityMap() {
        return facilityMap;
    }

    @Override
    public void addNewFacility(Facility facility) {
        facilityMap.put(facility, 0);
    }
}
