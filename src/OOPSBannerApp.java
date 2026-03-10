public class OOPSBannerAppUC7 {

    // Static inner class to store character and pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create character pattern objects
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
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Store characters to form the word "OOPS"
        CharacterPattern[] word = {O, O, P, S};

        // Print banner
        for (int line = 0; line < 7; line++) {
            StringBuilder sb = new StringBuilder();

            for (CharacterPattern cp : word) {
                sb.append(cp.getPattern()[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }
}
