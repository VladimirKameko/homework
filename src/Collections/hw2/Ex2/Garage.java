package Collections.hw2.Ex2;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public Map<Car, Integer> garage = new HashMap<>();

    public void parkingCar(Car car) {
        this.garage.put(car, this.garage.containsKey(car) ? this.garage.get(car) + 1 : 1);

    }

    public boolean exitCar(Car car) {
        if (!this.garage.containsKey(car)) {
            return false;
        }
        this.garage.put(car, this.garage.get(car) - 1);
        if (this.garage.get(car) < 1) {
            this.garage.remove(car);
        }
        return true;
    }

    public Integer carCount(Car car) {
        return (this.garage.containsKey(car)) ? this.garage.get(car) : 0;

    }

    public void garageShow(){
        for(Map.Entry<Car, Integer> entry : garage.entrySet()){
            System.out.println(entry.getKey()+" таких же машин в гараже:"+ entry.getValue());
        }
    }
}
