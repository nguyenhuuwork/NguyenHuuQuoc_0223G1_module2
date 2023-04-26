package case_study.model;

public abstract class Facility {
    private String codeService;
    private String nameService;
    private double areaFacility;
    private double chargeRent;
    private int maximumPeople;
    private String date;

    public Facility(String codeService, String nameService, double areaFacility, double chargeRent, int maximumPeople, String date) {
        this.codeService = codeService;
        this.nameService = nameService;
        this.areaFacility = areaFacility;
        this.chargeRent = chargeRent;
        this.maximumPeople = maximumPeople;
        this.date = date;
    }

    public Facility() {
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaFacility() {
        return areaFacility;
    }

    public void setAreaFacility(double areaFacility) {
        this.areaFacility = areaFacility;
    }

    public double getChargeRent() {
        return chargeRent;
    }

    public void setChargeRent(double chargeRent) {
        this.chargeRent = chargeRent;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaFacility=" + areaFacility +
                ", chargeRent=" + chargeRent +
                ", maximumPeople=" + maximumPeople +
                ", date='" + date + '\'' +
                '}';
    }
}
