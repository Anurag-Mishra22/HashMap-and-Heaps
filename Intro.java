
// In HashMap you can not controll where the value will be inserted it will be out of order.
import java.util.HashMap;
import java.util.Set;

public class Intro {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("US", 100);
        hm.put("Pak", 50);
        hm.put("UK", 40);
        System.out.println(hm); // {China=200, UK=40, Pak=50, US=100, India=135}

        hm.put("Nigeria", 5);
        hm.put("US", 25);
        System.out.println(hm); // {China=200, UK=40, Pak=50, Nigeria=5, US=25, India=135}

        System.out.println(hm.get("India")); // 135
        System.out.println(hm.get("Utopia")); // null

        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Utopia"));// false

        Set<String> keys = hm.keySet(); // we will get all the keys

        System.out.println(keys); // [China, UK, Pak, Nigeria, US, India]

        for (String key : hm.keySet()) {
            Integer val = hm.get(key);
            System.out.println(key + "-> " + val);
            // China-> 200
            // UK-> 40
            // Pak-> 50
            // Nigeria-> 5
            // US-> 25
            // India-> 135
        }
    }
}
