package case_study.model;

public class House extends Facility {
    private String houseStandard;
    private int floorHouse;

    public House(String codeService, String nameService, double areaFacility, double chargeRent, int maximumPeople, String date, String houseStandard, int floorHouse) {
        super(codeService, nameService, areaFacility, chargeRent, maximumPeople, date);
        this.houseStandard = houseStandard;
        this.floorHouse = floorHouse;
    }

    public House() {
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseStandard='" + houseStandard + '\'' +
                ", floorHouse=" + floorHouse +
                '}';
    }
}
