/**
 * =========================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * =========================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class demonstrates how to enforce uniqueness of
 * bogie IDs using HashSet.
 *
 * At this stage, the application:
 * - Adds bogie IDs (including duplicates)
 * - Automatically removes duplicates
 * - Displays only unique bogie IDs
 *
 * This ensures data consistency in train composition.
 *
 * @author PranavSRM
 * @version 3.0
 */

import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG101"); // duplicate
        bogies.add("BG104");
        bogies.add("BG102"); // duplicate

        // Display result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // Note about uniqueness
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}
