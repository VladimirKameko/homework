package Collections.hw2.Ex2;

public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        SportCars lamba = new SportCars("Lamborghini", "huracan", "red", 2018, 155.800);
        Trucks maz = new Trucks("Maz", "5551", "white", 2005, 12.500);
        Crossover bmw = new Crossover("BMW", "X5", "black", 2015, 38.400);
        MiniBus vw = new MiniBus("Volksvagen", "Caravelle", "Blue", 2010, 12.300);

        garage.parkingCar(lamba);
        garage.parkingCar(maz);
        garage.parkingCar(bmw);
        garage.parkingCar(vw);

        garage.garageShow();
        System.out.println();
        SportCars Lada = new SportCars("Lada", "Vesta-Sport", "green", 2018, 16.000);
        garage.parkingCar(Lada);
        garage.garageShow();
        System.out.println();

        System.out.println(garage.carCount(lamba));

        garage.exitCar(Lada);
        garage.garageShow();
    }
}
