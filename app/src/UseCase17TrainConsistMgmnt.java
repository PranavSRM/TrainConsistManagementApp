import java.util.Arrays;

/*
 * =========================================================
 * MAIN CLASS - UseCase17TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie names
 * alphabetically using Java's built-in Arrays.sort().
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for sorting
 * - Displays sorted result
 *
 * This maps optimized sorting using Java library utilities.
 *
 * @author PranavSRM
 * @version 17.0
 * =========================================================
 */

public class UseCase17TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("=======================================\n");

        // Create array (as per PDF example)
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // ---- SORT USING ARRAYS.SORT ----
        Arrays.sort(bogieNames);

        // Display sorted
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}