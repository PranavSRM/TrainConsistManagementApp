/*
 * =========================================================
 * MAIN CLASS - UseCase20TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * This class prevents searching when no bogies exist
 * by applying fail-fast validation using exceptions.
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search execution
 * - Displays meaningful message
 *
 * This maps defensive programming using runtime exceptions.
 *
 * @author PranavSRM
 * @version 20.0
 * =========================================================
 */

public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("=======================================\n");

        // Empty array (as per PDF scenario)
        String[] bogieIds = {};

        String searchId = "BG101";

        try {
            // ---- FAIL-FAST VALIDATION ----
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // ---- SEARCH LOGIC (only if valid) ----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // Display result
            if (found) {
                System.out.println("Bogie " + searchId + " found.");
            } else {
                System.out.println("Bogie " + searchId + " NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}