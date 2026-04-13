import java.util.Arrays;

/*
 * =========================================================
 * MAIN CLASS - UseCase19TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class searches for a bogie ID efficiently using
 * Binary Search on sorted data.
 *
 * At this stage, the application:
 * - Creates array of bogie IDs
 * - Sorts the array (precondition)
 * - Applies binary search logic
 * - Narrows search space each iteration
 * - Displays result
 *
 * This maps optimized searching using divide-and-conquer.
 *
 * @author PranavSRM
 * @version 19.0
 * =========================================================
 */

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("=======================================\n");

        // Create array (as per PDF)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // ---- PRECONDITION: SORT ----
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display sorted IDs
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- BINARY SEARCH ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = bogieIds[mid].compareTo(key);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}