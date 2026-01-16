package homework;

public class House {
    private int floors;
    private String address;
    private boolean forRent;

    // constructor
    public House(int floors, String address, boolean forRent) {
        this.floors = floors;
        this.address = address;
        this.forRent = forRent;
    }

    //methods
    public boolean isForRent() {
        return forRent;
    }

    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", address='" + address + '\'' +
                ", forRent=" + forRent +
                '}';
    }
}
