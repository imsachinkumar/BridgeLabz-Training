import java.util.*;
import java.util.stream.*;

public class InsuranceClaimAnalysis {

    static class Claim {
        String claimType;
        double claimAmount;

        Claim(String claimType, double claimAmount) {
            this.claimType = claimType;
            this.claimAmount = claimAmount;
        }
    }

    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 50000),
            new Claim("Vehicle", 30000),
            new Claim("Health", 70000),
            new Claim("Home", 45000),
            new Claim("Vehicle", 25000),
            new Claim("Health", 60000)
        );

        // Stream API logic
        Map<String, Double> averageClaimByType =
            claims.stream()
                  .collect(Collectors.groupingBy(c -> c.claimType, Collectors.averagingDouble(c -> c.claimAmount)));

        averageClaimByType.forEach((type, avg) ->
            System.out.println(type + " → Average Claim Amount: " + avg)
        );
    }
}
