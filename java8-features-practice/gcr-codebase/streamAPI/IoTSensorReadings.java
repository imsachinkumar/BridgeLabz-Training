import java.util.*;
public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(28.5, 35.2, 41.8, 22.0, 39.6);
        double threshold = 30.0;

        // Readings above threshold
        readings.stream()
            .filter(r -> r > threshold)
            .forEach(r ->
                System.out.println("High Sensor Reading: " + r)
            );
    }
}
