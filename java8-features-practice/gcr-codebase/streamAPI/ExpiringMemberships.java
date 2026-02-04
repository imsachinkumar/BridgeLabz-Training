import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class ExpiringMemberships {

    static class Member {
        String name;
        LocalDate expiryDate;

        Member(String name, LocalDate expiryDate) {
            this.name = name;
            this.expiryDate = expiryDate;
        }

        @Override
        public String toString() {
            return name + " | Expiry Date: " + expiryDate;
        }
    }

    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Amit", LocalDate.now().plusDays(10)),
            new Member("Neha", LocalDate.now().plusDays(40)),
            new Member("Ravi", LocalDate.now().plusDays(25)),
            new Member("Pooja", LocalDate.now().minusDays(5)),
            new Member("Karan", LocalDate.now().plusDays(30))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        // Stream API logic
        members.stream()
            .filter(m -> 
                m.expiryDate.isAfter(today.minusDays(1)) &&
                m.expiryDate.isBefore(next30Days.plusDays(1))
            )
            .forEach(System.out::println);
    }
}
