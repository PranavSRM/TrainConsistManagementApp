import java.util.ArrayList;
import java.util.List;

/*
 * =========================================================
 * MAIN CLASS - UseCase10TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 10: Count Total Seats in Train (reduce)
 *
 * Description:
 * This class aggregates seating capacity of all bogies
 * into a single total using Stream reduce().
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Uses map() to extract capacity
 * - Uses reduce() to sum values
 * - Displays total seating capacity
 *
 * This maps aggregation logic using reduce().
 *
 * @author PranavSRM
 * @version 10.0
 * =========================================================
 */

public class UseCase10TrainConsistMgmnt {

    // Reusing Bogie model
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
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("=======================================\n");

        // Create list of bogies (as per PDF page 2)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- AGGREGATION USING MAP + REDUCE ----
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Display total
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}