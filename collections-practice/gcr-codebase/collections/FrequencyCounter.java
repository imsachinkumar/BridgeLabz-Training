import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class FrequencyCounter {
    // Method to count frequency of each string
    public static Map<String, Integer> findFrequency(List<String> list) {

        Map<String, Integer> frequencyMap = new HashMap<>();
        // Traverse each element in the list
        for (String item : list) {
            // If key already exists, increase count
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            }
            // If key does not exist, add with count 1
            else {
                frequencyMap.put(item, 1);
            }
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        System.out.println("Input List: " + fruits);
        System.out.println("Frequency Map: " + findFrequency(fruits));
    }
}
