import java.util.*;
public class InvertMap {
    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        
        Map<Integer, List<String>> output = new HashMap<>();

        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            int value = entry.getValue();
            String key = entry.getKey();

            if (!output.containsKey(value)) {
                output.put(value, new ArrayList<>());
            }
            output.get(value).add(key);
        }

        System.out.println(output);
    }
}
