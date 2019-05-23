package oop_hw_1.oopHw1Ex2;

class Car {
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

    void fillFuel(double liters) {
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

    private double checkReserveTrip(){                    //на сколько километров пути есть топлива в баке
        return getFuelConsumtion() * getFuel();
    }
    private double fuelRequired(double roudLength){    //сколько топлива необходимо что бы проехать заданное кол км
        return ((getFuelConsumtion() * roudLength) / 100);

    }

    double tripCar(double roudLength) {
        if (roudLength > checkReserveTrip()) {
            setDistance(getDistance() + checkReserveTrip());
            setFuel(getFuel()-fuelRequired(checkReserveTrip()));
            return getDistance();
        }
        else {
            setDistance(getDistance() + roudLength);
            setFuel(getFuel() - fuelRequired(roudLength));
            return getDistance();
        }



    }
}
