public class OOPSBannerUC6 {

    // Method to generate pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method to generate pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Method to generate pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        // Get patterns using static methods
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Banner array
        String[] banner = new String[7];

        // Build banner
        for (int i = 0; i < 7; i++) {
            banner[i] = o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i];
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
