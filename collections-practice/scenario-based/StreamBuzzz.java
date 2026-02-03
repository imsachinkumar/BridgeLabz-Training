import java.util.*;
class CreatorStats {

    public String CreatorName;
    public double[] WeeklyLikes;
    // Static list to store creators
    public static List<CreatorStats> EngagementBoard = new ArrayList<>();
}
public class StreamBuzzz{
    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

    // Get count of weeks >= threshold
    public Dictionary<String, Integer> GetTopPostCounts(
        List<CreatorStats> records, double likeThreshold) {
        Dictionary<String, Integer> result = new Hashtable<>();

        for (CreatorStats creator : records) {
            int count = 0;

            for (double likes : creator.WeeklyLikes) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(creator.CreatorName, count);
            }
        }

        return result;
    }

    // Calculate overall average likes
    public double CalculateAverageLikes() {

        double sum = 0;
        int totalCount = 0;
        for (CreatorStats creator : CreatorStats.EngagementBoard) {
            for (double likes : creator.WeeklyLikes) {
                sum += likes;
                totalCount++;
            }
        }

        if (totalCount == 0) {
            return 0;
        }
        return sum / totalCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StreamBuzzz program = new StreamBuzzz();
        while (true) {

            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    CreatorStats creator = new CreatorStats();
                    System.out.println("Enter Creator Name:");
                    creator.CreatorName = sc.nextLine();

                    creator.WeeklyLikes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");

                    for (int i = 0; i < 4; i++) {
                        creator.WeeklyLikes[i] = sc.nextDouble();
                    }
                    program.RegisterCreator(creator);
                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    double threshold = sc.nextDouble();

                    Dictionary<String, Integer> result =
                            program.GetTopPostCounts(
                                    CreatorStats.EngagementBoard, threshold);

                    if (result.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        Enumeration<String> keys = result.keys();
                        while (keys.hasMoreElements()) {
                            String name = keys.nextElement();
                            System.out.println(name + " - " + result.get(name));
                        }
                    }
                    break;

                case 3:
                    double avg = program.CalculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + (int) avg);
                    break;

                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
