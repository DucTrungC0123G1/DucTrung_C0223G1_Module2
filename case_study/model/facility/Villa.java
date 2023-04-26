package case_study.model.facility;

public class Villa extends Facility {
   private String roomStandard;
   private int numberFloors;
   private double poolArea;

    public Villa(int serviceID, String serviceName, double useArea, double rentPrice, int maxPerson, String typeRent, String roomStandard, int numberFloors, double poolArea) {
        super(serviceID, serviceName, useArea, rentPrice, maxPerson, typeRent);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
        this.poolArea = poolArea;
    }

    public Villa() {
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "VillaModel{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors=" + numberFloors +
                ", poolArea=" + poolArea +
                '}';
    }
}
