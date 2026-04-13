import java.util.*;
import java.util.stream.Collectors;

/*
 * =========================================================
 * MAIN CLASS - UseCase9TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 *
 * Description:
 * This class groups similar bogies together using
 * Java Stream Collectors.groupingBy().
 *
 * At this stage, the application:
 * - Creates a List of bogies
 * - Converts list into stream
 * - Groups bogies by name/type
 * - Stores grouped data in Map<String, List<Bogie>>
 * - Displays grouped structure
 *
 * This maps classification logic using groupingBy.
 *
 * @author PranavSRM
 * @version 9.0
 * =========================================================
 */

public class UseCase9TrainConsistMgmnt {

    // Reusing Bogie model from UC7/UC8
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("=======================================\n");

        // Create list of bogies (as per PDF)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // Display all bogies
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- GROUPING USING COLLECTORS.GROUPINGBY ----
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped structure
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

            System.out.println("\nBogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity -> " + b.capacity);
            }
        }

        System.out.println("\nUC9 grouping completed...");
    }
}