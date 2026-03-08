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
/**
 * OOPSBannerApp
 *
 * UC7: Encapsulate ASCII patterns in CharacterPattern class
 * for modularity, reusability, and scalability.
 *
 * Author: karansurjith
 * Version: 7.0
 */

public class OOPSBannerApp {

    // Static inner class to map character to banner pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Define patterns for O, P, S
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "     *",
                "     *",
                "***** "
        });

        // Store characters in order for "OOPS"
        CharacterPattern[] word = {O, O, P, S};

        // Print banner line by line
        for (int line = 0; line < 7; line++) {
            StringBuilder sb = new StringBuilder();
            for (CharacterPattern c : word) {
                sb.append(c.getPattern()[line]).append("  "); // space between letters
            }
            System.out.println(sb.toString());
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int patternHeight = patternMap.get('O').length;

        for (int i = 0; i < patternHeight; i++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }

            System.out.println();
        }
    }
}