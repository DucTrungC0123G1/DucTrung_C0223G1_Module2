package case_study.model.booking;

public abstract class BookingAndContract {
    private int bookingID;

    public BookingAndContract() {
    }

    public BookingAndContract(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    @Override
    public String toString() {
        return "BookingAndContract{" +
                "bookingID=" + bookingID +
                '}';
    }
}
