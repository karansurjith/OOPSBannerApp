/**
 * OOPSBannerApp
 *
 * UC4: Refactor banner using String array and enhanced for-loop
 * to improve modularity, maintainability, and scalability.
 *
 * @author karansurjith
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all banner lines inside an array
        String[] banner = {

            String.join("", " *****   ", " *****   ", " *****   ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", "*     * ", "*     * ", "*     * ", "*      "),
            String.join("", "*     * ", "*     * ", " *****   ", " *****  "),
            String.join("", "*     * ", "*     * ", "*        ", "       "),
            String.join("", "*     * ", "*     * ", "*        ", "       "),
            String.join("", " *****   ", " *****   ", "*        ", " ***** ")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}