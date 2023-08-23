import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
    }
}