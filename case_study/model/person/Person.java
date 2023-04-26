package case_study.model.person;

public abstract class Person {
    String name;
    String birthDay;
    boolean gender;
    long cardID;
    int phone;
    String email;

    public Person() {
    }

    public Person(String name, String birthDay, boolean gender, int cardID, int phone, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.cardID = cardID;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public long getCardID() {
        return cardID;
    }

    public void setCardID(long cardID) {
        this.cardID = cardID;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "name=" + name +
                ", birthDay='" + birthDay + '\'' +
                ", gender=" + gender +
                ", cardID=" + cardID +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
