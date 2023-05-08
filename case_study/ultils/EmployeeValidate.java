package case_study.ultils;

public class EmployeeValidate {
    private static final String REGEX_EMPLOYEE_NAME = "^[A-Z][a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";

    public static boolean checkEmployeeName(String employeeName) {
        return employeeName.matches(REGEX_EMPLOYEE_NAME) ? true : false;
    }

    private static final String REGEX_EMPLOYEE_ID = "^(NV)-[0-9]{4}$";

    public static boolean checkEmployeeID(String employeeID) {
        return employeeID.matches(REGEX_EMPLOYEE_ID) ? true : false;
    }

    private static final String REGEX_EMPLOYEE_CITIZEN_CODE = "^\\d{9,12}$";

    public static boolean checkEmployeeCitizenCode(String employeeCitizenCode) {
        return employeeCitizenCode.matches(REGEX_EMPLOYEE_CITIZEN_CODE) ? true : false;
    }
    private static final String REGEX_EMPLOYEE_PHONE="^\\d{2}[0]\\d{9}";
    public static boolean checkEmployeePhone(String employeePhone){
        return employeePhone.matches(REGEX_EMPLOYEE_PHONE)? true:false;
    }
    private static final String REGEX_EMPLOYEE_EMAIL="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static boolean checkEmployeeMail(String employeeEmail){
        return employeeEmail.matches(REGEX_EMPLOYEE_EMAIL)? true: false;
    }
    public static final String REGEX_EMPLOYEE_BIRTHDAY="^((19|20)\\\\d\\\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
    public static boolean checkEmployeeBirthday(String employeeBirthday){
        return  employeeBirthday.matches(REGEX_EMPLOYEE_BIRTHDAY)? true: false;
    }

}
