import CarRetal.Car;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        HashMap<String, Integer> auto = new HashMap<String, Integer>();
// Set values
        auto.put("Mercedes", 200);
        auto.put("Mazda", 100);
        auto.put("Mitsubishi", 100);
        auto.put("BMW", 200);
        auto.put("lada", 10);

        System.out.println(car.getRent(auto));
        System.out.println(car.getAverageSize(auto));
    }

}
