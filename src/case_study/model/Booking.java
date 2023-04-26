package case_study.model;

public class Booking {
    private String codeBooking;
    private String dateBooking;
    private String dateCheckIn;
    private String dateCheckOut;
    private String codeCustomer;
    private String codeService;

    public Booking(String codeBooking, String dateBooking, String dateCheckIn, String dateCheckOut, String codeCustomer, String codeService) {
        this.codeBooking = codeBooking;
        this.dateBooking = dateBooking;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.codeCustomer = codeCustomer;
        this.codeService = codeService;
    }

    public Booking() {
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getDateCheckIn() {
        return dateCheckIn;
    }

    public void setDateCheckIn(String dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public String getDateCheckOut() {
        return dateCheckOut;
    }

    public void setDateCheckOut(String dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", dateBooking='" + dateBooking + '\'' +
                ", dateCheckIn='" + dateCheckIn + '\'' +
                ", dateCheckOut='" + dateCheckOut + '\'' +
                ", codeCustomer='" + codeCustomer + '\'' +
                ", codeService='" + codeService + '\'' +
                '}';
    }
}
