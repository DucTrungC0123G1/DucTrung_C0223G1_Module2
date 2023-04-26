package case_study.model.facility;

public abstract class Facility {
    int serviceID;
    String serviceName;
    double useArea;
    double rentPrice;
    int maxPerson;
    String typeRent;

    public Facility() {
    }

    public Facility(int serviceID, String serviceName, double useArea, double rentPrice, int maxPerson, String typeRent) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentPrice = rentPrice;
        this.maxPerson = maxPerson;
        this.typeRent = typeRent;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "FacilityModel{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", rentPrice=" + rentPrice +
                ", maxPerson=" + maxPerson +
                ", typeRent=" + typeRent +
                '}';
    }
}
