package case_study.model.facility;

public class House extends Facility {
    private String roomStandard;
   private int numberFloors;

    public House() {
    }

    public House(int serviceID, String serviceName, double useArea, double rentPrice, int maxPerson, String typeRent, String roomStandard, int numberFloors) {
        super(serviceID, serviceName, useArea, rentPrice, maxPerson, typeRent);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "HouseModel{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
