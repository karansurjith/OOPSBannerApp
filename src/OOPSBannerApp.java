/**
 * OOPSBannerApp
 *
 * UC3: Refactor banner creation using String.join()
 * to improve memory efficiency and avoid unnecessary
 * intermediate String objects created by + operator.
 *
 * @author karansurjith
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("",
                " *****   ", " *****   ", " *****   ", " ***** "));

        System.out.println(String.join("",
                "*     * ", "*     * ", "*     * ", "*     *"));

        System.out.println(String.join("",
                "*     * ", "*     * ", "*     * ", "*      "));

        System.out.println(String.join("",
                "*     * ", "*     * ", " *****   ", " *****  "));

        System.out.println(String.join("",
                "*     * ", "*     * ", "*        ", "       "));

        System.out.println(String.join("",
                "*     * ", "*     * ", "*        ", "       "));

        System.out.println(String.join("",
                " *****   ", " *****   ", "*        ", " ***** "));
    }
}