package case_study.model.person;

public class Customer extends Person{
   private String typeCustomer;
   private String address;
   private String customerID;


    public Customer() {
    }

    public Customer(String name, String birthDay, boolean gender, String cardID, long phone, String email, String typeCustomer,
                    String address, String customerID) {
        super(name, birthDay, gender, cardID, phone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.customerID= customerID;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                ", customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender=" + gender +
                ", cardID=" + cardID +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
    // super(name, birthDay, gender, cardID, phone, email);
    //        this.typeCustomer = typeCustomer;
    //        this.address = address;
    //        this.customerID= customerID;
    public String getInfoCustomerToCsv(){
        return super.getName()+","+super.getBirthDay()+","+super.isGender()+","+super.getCardID()+","+super.getPhone()+
                ","+super.getEmail()+","+this.typeCustomer+","+this.address+","+this.customerID;
    }
}
