package CarRetal;

import java.util.HashMap;

public class Car {

    public int getAverageSize(HashMap<String, Integer> auto) {
        int averageSize = 0;
        int result = 0;

        for (int d : auto.values()) {
            result += d;
        }
        return averageSize = result/auto.size();
    }
    public HashMap<String, Integer> getRent(HashMap<String, Integer> auto) {
        HashMap<String, Integer> auto2 = new HashMap<String, Integer>();
        for (String i : auto.keySet()) {
            if (auto.get(i) == 100) {
                System.out.println("sort of price: " + i + " value: " + auto.get(i));
                auto2.put(i,auto.get(i));
            }
        }
        return auto2;
    }
}


