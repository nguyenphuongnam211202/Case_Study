package models;

public abstract class Facility {
    private String nameService;
    private float useArea = 0.0f;
    private long rentCost;
    private int maxPeople;
    private String rentType;

    public Facility(){}

    public Facility(String nameService, float useArea, long rentCost, int maxPeople, String rentType) {
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getUseArea() {
        return useArea;
    }

    public void setUseArea(float useArea) {
        this.useArea = useArea;
    }

    public long getRentCost() {
        return rentCost;
    }

    public void setRentCost(long rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract float getSumArea();

}
