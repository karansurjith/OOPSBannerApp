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
public class OOPSBannerUC6 {

    // Helper method to generate pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }

    // Helper method to generate pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
                String.join("", "*******  "),
                String.join("", "*      * "),
                String.join("", "*      * "),
                String.join("", "*******  "),
                String.join("", "*        "),
                String.join("", "*        "),
                String.join("", "*        ")
        };
    }

    // Helper method to generate pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
                String.join("", " ******  "),
                String.join("", "*        "),
                String.join("", "*        "),
                String.join("", " *****   "),
                String.join("", "      *  "),
                String.join("", "      *  "),
                String.join("", " ******  ")
        };
    }

    public static void main(String[] args) {

        // Populate banner using methods
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Assemble banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o1[i] + " " + o2[i] + " " + p[i] + " " + s[i];
        }

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
