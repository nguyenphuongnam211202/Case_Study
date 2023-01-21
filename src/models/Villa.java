package models;

public class Villa extends Facility{
    private String standardRoom;
    private float poolArea = 0.0f;
    private int floors;

    public Villa(){}

    public Villa(String standardRoom, float poolArea, int floor) {
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floors = floor;
    }

    public Villa(String nameService, float useArea, long rentCost, int maxPeople, String rentType, String standardRoom, float poolArea, int floor) {
        super(nameService, useArea, rentCost, maxPeople, rentType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floors = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public float getSumArea() {
        return poolArea + super.getUseArea();
    }
}
