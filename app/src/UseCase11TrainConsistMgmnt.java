import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 * =========================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 11: Validate Train ID & Cargo Code (Regex)
 *
 * Description:
 * This class validates Train ID and Cargo Code formats
 * using Regular Expressions (Pattern & Matcher).
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation results
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author PranavSRM
 * @version 11.0
 * =========================================================
 */

public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("=======================================\n");

        // ---- INPUT ----
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX PATTERNS (from PDF page 3) ----
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // ---- COMPILE PATTERNS ----
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // ---- MATCH INPUT ----
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // ---- OUTPUT ----
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}