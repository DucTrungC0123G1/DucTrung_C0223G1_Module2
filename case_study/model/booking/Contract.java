package case_study.model.booking;

public class Contract extends BookingAndContract{
    private int contractID;
    private double depositContract;
    private double totalPayContract;

    public Contract() {
    }
    public Contract(int bookingID, int contractID, double depositContract, double totalPayContract) {
        super(bookingID);
        this.contractID = contractID;
        this.depositContract = depositContract;
        this.totalPayContract = totalPayContract;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public double getDepositContract() {
        return depositContract;
    }

    public void setDepositContract(double depositContract) {
        this.depositContract = depositContract;
    }

    public double getTotalPayContract() {
        return totalPayContract;
    }

    public void setTotalPayContract(double totalPayContract) {
        this.totalPayContract = totalPayContract;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID=" + contractID +
                ", depositContract=" + depositContract +
                ", totalPayContract=" + totalPayContract +
                '}';
    }
}
