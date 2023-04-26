package case_study.model.facility;

public class Room extends Facility {
   private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(int serviceID, String serviceName, double useArea, double rentPrice, int maxPerson, String typeRent, String freeService) {
        super(serviceID, serviceName, useArea, rentPrice, maxPerson, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "RoomModel{" +
                "freeService='" + freeService + '\'' +
                ", serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", rentPrice=" + rentPrice +
                ", maxPerson=" + maxPerson +
                ", typeRent=" + typeRent +
                '}';
    }
}
