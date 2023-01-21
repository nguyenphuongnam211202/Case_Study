package models;

public class Room extends Facility{
    private String freeService;

    public Room(){}

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, float useArea, long rentCost, int maxPeople, String rentType, String freeService) {
        super(nameService, useArea, rentCost, maxPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public float getSumArea() {
        return super.getUseArea();
    }
}
