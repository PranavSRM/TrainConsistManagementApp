/*
 * =========================================================
 * MAIN CLASS - UseCase15TrainConsistMgmnt
 * =========================================================
 *
 * Use Case 15: Safe Cargo Assignment using try-catch-finally
 *
 * Description:
 * This class safely assigns cargo to goods bogies
 * while handling unsafe combinations using runtime exceptions.
 *
 * At this stage, the application:
 * - Defines a custom runtime exception
 * - Validates cargo assignment rules
 * - Throws exception for unsafe combinations
 * - Handles exception using try-catch
 * - Uses finally block for logging
 *
 * Rule:
 * Rectangular bogie cannot carry Petroleum.
 *
 * This maps runtime safety using try-catch-finally.
 *
 * @author PranavSRM
 * @version 15.0
 * =========================================================
 */

public class UseCase15TrainConsistMgmnt {

    // ---- CUSTOM RUNTIME EXCEPTION ----
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---- GOODS BOGIE MODEL ----
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {

            try {
                // Rule: Rectangular cannot carry Petroleum
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo validation completed for " + shape + " bogie\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("=======================================\n");

        // Safe assignment
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        System.out.println("UC15 runtime handling completed...");
    }
}