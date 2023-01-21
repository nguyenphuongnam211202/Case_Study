package models;

public class House extends Facility{
    private String standardRoom;

    private int floors;

    public House(){}

    public House(String standardRoom, int floors) {
        this.standardRoom = standardRoom;
        this.floors = floors;
    }

    public House(String nameService, float useArea, long rentCost, int maxPeople, String rentType, String standardRoom, int floors) {
        super(nameService, useArea, rentCost, maxPeople, rentType);
        this.standardRoom = standardRoom;
        this.floors = floors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public float getSumArea() {
        return super.getUseArea();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
