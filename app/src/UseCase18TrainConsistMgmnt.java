/*
 * =========================================================
 * MAIN CLASS - UseCase18TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class searches for a specific bogie ID
 * using Linear Search (sequential traversal).
 *
 * At this stage, the application:
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverses array sequentially
 * - Compares using equals()
 * - Stops when match is found
 * - Displays result
 *
 * This maps basic searching logic using Linear Search.
 *
 * @author PranavSRM
 * @version 18.0
 * =========================================================
 */

public class UseCase18TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("=======================================\n");

        // Create array (as per PDF example)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchId = "BG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- LINEAR SEARCH ----
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // early termination
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}