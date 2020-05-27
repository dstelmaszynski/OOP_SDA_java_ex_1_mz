package pl.dstelmaszynski;

public class Engine {

    private Double capacity;
    private Integer horsePower;
    private Double fuelConsumption;

    public Engine(Double capacity, Integer horsePower, Double fuelConsumption) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    public Double getCapacity() {
        return capacity;

    }
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString(){
        return "pojemnośc: " + capacity + "\nmoc: " + horsePower + "\nspalanie: " + fuelConsumption;


    }
}
