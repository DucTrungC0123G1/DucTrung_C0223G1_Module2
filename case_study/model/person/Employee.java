package case_study.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;
    private String employeeCitizenCode;


    public Employee() {
    }

    public Employee(String name, String birthDay, boolean gender, String employeeCitizenCode, long phone, String email, String level,
                    String position, double salary, String employeeID) {
        super(name, birthDay, gender, employeeCitizenCode,phone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
        this.employeeCitizenCode = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeCitizenCode() {
        return employeeCitizenCode;
    }

    public void setEmployeeCitizenCode(String employeeCitizenCode) {
        this.employeeCitizenCode = employeeCitizenCode;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender=" + gender +
                ", employeeID='" + employeeCitizenCode + '\'' +
                ", cardID=" + cardID + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", level='" + level +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
    //"Employee{" +
    //                "level='" + level + '\'' +
    //                ", position='" + position + '\'' +
    //                ", salary=" + salary +
    //                ", employeeID='" + employeeCitizenCode + '\'' +
    //                ", name='" + name + '\'' +
    //                ", birthDay='" + birthDay + '\'' +
    //                ", gender=" + gender +
    //                ", cardID=" + cardID +
    //                ", phone=" + phone +
    //                ", email='" + email + '\'' +
    //                '}';

    //String name, String birthDay, boolean gender, int cardID, int phone, String email, String level,
    //                    String position, double salary
    public String getInfoEmployeeToCsv() {
        return super.getName() + "," + super.getBirthDay() + "," + super.isGender() + "," + super.getCardID() + "," + super.getPhone() + "," +
                super.getEmail() + "," + this.level + "," + this.position + "," + this.salary+","+this.employeeCitizenCode;
    }
}
