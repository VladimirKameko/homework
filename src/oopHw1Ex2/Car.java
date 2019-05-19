package oopHw1Ex2;

public class Car {
    private double fuel;
    private double distance;
    private double fuelConsumtion;

    private void setFuel(double fuel) {
        this.fuel = fuel;
    }

    private void setDistance(double distance) {
        this.distance = distance;
    }

    private void setFuelConsumtion(double fuelConsumtion) {
        this.fuelConsumtion = fuelConsumtion;
    }

    private double getFuel() {
        return fuel;
    }

    private double getDistance() {
        return distance;
    }

    private double getFuelConsumtion() {
        return fuelConsumtion;
    }

    Car(double fuelConsumtion) {
        setFuelConsumtion(fuelConsumtion);
    }

    public void fueling(double liters) {
        setFuel(getFuel() + liters);
    }

    public String tripCar(double roudLength) {
        if (roudLength > (getFuelConsumtion() * getFuel())) {
            return "Недостаточно топлива для поездки. Необходимо заправиться";
        }
        setDistance(getDistance() + roudLength);
        setFuel(getFuel() - ((getFuelConsumtion() * roudLength) / 100));
        return "Проехали: " + getDistance() + "\n" + "Топлива в баке: " + getFuel();


    }
}
