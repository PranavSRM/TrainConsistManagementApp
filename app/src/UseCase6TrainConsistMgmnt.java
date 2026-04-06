import java.util.HashMap;
import java.util.Map;

/*
 * =========================================================
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 *
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 *
 * This maps lookup-based access using HashMap.
 *
 * @author PranavSRM
 * @version 6.0
 * =========================================================
 */

public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("=======================================\n");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- Insert bogie capacities ----
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);
        capacityMap.put("Cargo", 100);

        // ---- Display bogie capacity details ----
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 mapping completed...");
    }
}