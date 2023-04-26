package case_study.model.booking;

public class Booking extends BookingAndContract{
    private String bookingDay;
    private String startDay;
    private String endDay;
    private int customerID;
    private int serviceID;

    public Booking() {
    }

    public Booking(int bookingID, String bookingDay, String startDay, String endDay, int customerID, int serviceID) {
        super(bookingID);
        this.bookingDay = bookingDay;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerID = customerID;
        this.serviceID = serviceID;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingDay='" + bookingDay + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerID=" + customerID +
                ", serviceID=" + serviceID +
                '}';
    }
}
