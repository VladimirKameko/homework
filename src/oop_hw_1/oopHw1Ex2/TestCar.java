package oop_hw_1.oopHw1Ex2;

class TestCar {
    public static void main(String[] args) {
        Car vw = new Car(10);
        vw.fueling(10);
        System.out.println(vw.tripCar(100));
        System.out.println(vw.tripCar(100));
    }
}
