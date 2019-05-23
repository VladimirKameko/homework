package oop_hw_1.oopHw1Ex2;

public class Car {
    private double fuel;
    private double distance;
    private double fuelConsumtion;

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setFuelConsumtion(double fuelConsumtion) {
        this.fuelConsumtion = fuelConsumtion;
    }

    public double getFuel() {
        return fuel;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelConsumtion() {
        return fuelConsumtion;
    }

    public Car(double fuelConsumtion) {
        setFuelConsumtion(fuelConsumtion);
    }

    public void fillFuel(double liters) {
        setFuel(getFuel() + liters);
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", distance=" + distance +
                ", fuelConsumtion=" + fuelConsumtion +
                '}';
    }

    private double checkReserveTrip() {
        return getFuelConsumtion() * getFuel();
    }
    //на сколько километров пути есть топлива в баке

    private double fuelRequired(double roudLength) {
        return ((getFuelConsumtion() * roudLength) / 100);
    }
    //сколько топлива необходимо что бы проехать заданное кол км

    public double tripCar(double roudLength) {
        double roud = checkReserveTrip();
        if (roudLength > checkReserveTrip()) {
            setDistance(getDistance() + checkReserveTrip());
            setFuel(getFuel() - fuelRequired(checkReserveTrip()));
            return roud;
        } else {
            setDistance(getDistance() + roudLength);
            setFuel(getFuel() - fuelRequired(roudLength));
            return roudLength;
        }
    }
}
