package case_study.model.person;

public class Customer extends Person{
   private String typeCustomer;
   private String address;

    public Customer() {
    }

    public Customer(String name, String birthDay, boolean gender, int cardID, int phone, String email, String typeCustomer, String address) {
        super(name, birthDay, gender, cardID, phone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
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

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
