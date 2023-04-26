package case_study.model;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room(String codeService, String nameService, double areaFacility, double chargeRent, int maximumPeople, String date, String freeServiceIncluded) {
        super(codeService, nameService, areaFacility, chargeRent, maximumPeople, date);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room() {
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
