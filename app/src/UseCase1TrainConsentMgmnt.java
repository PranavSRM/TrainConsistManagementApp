/**
 * =========================================================
 * MAIN CLASS - UseCase1TrainConsentMgmnt
 * =========================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic list to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * =========================================================
 @author PranavSRM
 @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsentMgmnt {

    public static void main(String[] args) {

        // Step 1: Print welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Step 4: Display current state
        System.out.println("Train consist initialized successfully.");
    }
}