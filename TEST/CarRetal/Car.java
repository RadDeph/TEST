package TEST.CarRetal;

import java.util.HashMap;

public class Car {
private String model;
private int size;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getAverageSize(String model, int size) {
        int averageSize = 0;

        HashMap<String, Integer> auto = new HashMap<String, Integer>();

        auto.put("Mercedes", 200);
        auto.put("Mazda", 100);
        auto.put("Mitsubishi", 100);
        auto.put("BMW", 200);
        auto.put("lada", 10);


        int result = 0;

        for (int d : auto.values()) {
            result += d;
        }
        System.out.println("medium size " + result / auto.size());
        return averageSize = result/auto.size();
    }
}


