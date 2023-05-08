package case_study.ultils;

public class CustomerValidate {
    private static final String REGEX_CUSTOMER_NAME = "^[A-Z][a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";

    public static boolean checkCustomerName(String customerName) {
        return customerName.matches(REGEX_CUSTOMER_NAME) ? true : false;
    }
    private static final String REGEX_CUSTOMER_CARD_ID = "^\\d{9,12}$";

    public static boolean checkCustomerCardID(String customerCardID) {
        return customerCardID.matches(REGEX_CUSTOMER_CARD_ID) ? true : false;
    }
    private static final String REGEX_CUSTOMER_PHONE="^\\d{2}[0]\\d{9}";
    public static boolean checkCustomerPhone(String phoneCustomer){
        return phoneCustomer.matches(REGEX_CUSTOMER_PHONE)? true:false;
    }
    private static final String REGEX_CUSTOMER_EMAIL ="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static boolean checkCustomerEmail(String emailCustomer){
        return emailCustomer.matches(REGEX_CUSTOMER_EMAIL)? true: false;
    }
    private static final String REGEX_CUSTOMER_ID = "^(KH)-[0-9]{4}$";

    public static boolean checkCustomerID(String employeeID) {
        return employeeID.matches(REGEX_CUSTOMER_ID) ? true : false;
    }
    public static final String REGEX_CUSTOMER_BIRTHDAY ="^((19|20)\\\\d\\\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
    public static boolean checkCustomerBirthday(String customerBirthday){
        return  customerBirthday.matches(REGEX_CUSTOMER_BIRTHDAY)? true: false;
    }
}
