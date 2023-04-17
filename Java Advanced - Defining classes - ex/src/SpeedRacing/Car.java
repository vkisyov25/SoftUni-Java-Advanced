package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private int distance;

    public Car(String model, double fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distance = 0;
    }

    public boolean drive(int distance){
        double fuelNeeded = distance * this.fuelCostPerKm;

        if(this.fuelAmount >= fuelNeeded){
            this.fuelAmount -= fuelNeeded;
            this.distance += distance;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model, this.fuelAmount,this.distance);
    }
}
