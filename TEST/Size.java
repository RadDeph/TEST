import java.util.HashMap;

public class Size {
    public static void Size() {

        HashMap<String, String> auto = new HashMap<String, String>();

        auto.put("Mercedes", "200");
        auto.put("Mazda", "100");
        auto.put("Mitsubishi", "100");
        auto.put("BMW", "200");
        auto.put("lada", "10");



        for (String i : auto.keySet()) {
            if (auto.get(i) == "200") {
                System.out.println("sort of price: " + i + " value: " + auto.get(i));
            }
        }
    }
}
