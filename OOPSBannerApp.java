/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * Demonstrates concise array initialization using String.join()
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize banner lines in one statement
        String[] lines = {
            String.join("  ", " *** ", " *** ", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "**** ", " *** "),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", " *** ", " *** ", "*    ", "**** ")
        };

        // Print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}