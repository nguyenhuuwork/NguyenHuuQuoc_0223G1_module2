package case_study.model;

public class Villa extends Facility {
    private String villaStandard;
    private double areaPool;
    private int floorVilla;

    public Villa(String codeService, String nameService, double areaFacility, double chargeRent, int maximumPeople,
                 String date, String villaStandard, double areaPool, int floorVilla) {
        super(codeService, nameService, areaFacility, chargeRent, maximumPeople, date);
        this.villaStandard = villaStandard;
        this.areaPool = areaPool;
        this.floorVilla = floorVilla;
    }

    public Villa() {
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "villaStandard='" + villaStandard + '\'' +
                ", areaPool=" + areaPool +
                ", floorVilla=" + floorVilla +
                '}';
    }
}
