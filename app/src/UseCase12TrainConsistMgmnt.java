import java.util.ArrayList;
import java.util.List;

/*
 * =========================================================
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class enforces domain safety rules on goods bogies
 * using Stream API and conditional logic.
 *
 * At this stage, the application:
 * - Creates goods bogie list
 * - Converts list into stream
 * - Applies safety validation rule
 * - Uses allMatch() for compliance check
 * - Displays safety status
 *
 * Rule:
 * Cylindrical bogies must carry ONLY Petroleum.
 *
 * This maps real-world cargo safety rules using Streams.
 *
 * @author PranavSRM
 * @version 12.0
 * =========================================================
 */

public class UseCase12TrainConsistMgmnt {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("=======================================\n");

        // Create goods bogie list (based on PDF example)
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // violation

        // Display bogies
        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // ---- SAFETY RULE USING allMatch() ----
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}