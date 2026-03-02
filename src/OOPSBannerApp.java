/**
 * OOPSBannerApp
 *
 * UC5: Combine array declaration and initialization
 * using String.join() for concise and readable code.
 *
 * @author karansurjith
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array declaration + initialization in a single statement
        String[] banner = {
            String.join("", " *****   ", " *****   ", " *****   ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", "*     * ", "*     * ", "*     * ", "*      "),
            String.join("", "*     * ", "*     * ", " *****   ", " *****  "),
            String.join("", "*     * ", "*     * ", "*        ", "       "),
            String.join("", "*     * ", "*     * ", "*        ", "       "),
            String.join("", " *****   ", " *****   ", "*        ", " ***** ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}