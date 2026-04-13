/*
 * =========================================================
 * MAIN CLASS - UseCase16TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity (Bubble Sort)
 *
 * Description:
 * This class demonstrates manual sorting of passenger
 * bogie capacities using Bubble Sort algorithm instead
 * of built-in sorting utilities.
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when needed
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort.
 *
 * @author PranavSRM
 * @version 16.0
 * =========================================================
 */

public class UseCase16TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("=======================================\n");

        // Create array (as per PDF example)
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original array
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // ---- BUBBLE SORT ----
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}