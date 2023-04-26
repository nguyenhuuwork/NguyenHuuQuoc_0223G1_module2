package case_study.model;

public class Contract {
    private String idContract;
    private String codeContract;
    private double depositContract;
    private double totalPayment;

    public Contract(String idContract, String codeContract, double depositContract, double totalPayment) {
        this.idContract = idContract;
        this.codeContract = codeContract;
        this.depositContract = depositContract;
        this.totalPayment = totalPayment;
    }

    public Contract() {
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(String codeContract) {
        this.codeContract = codeContract;
    }

    public double getDepositContract() {
        return depositContract;
    }

    public void setDepositContract(double depositContract) {
        this.depositContract = depositContract;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", codeContract='" + codeContract + '\'' +
                ", depositContract=" + depositContract +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
