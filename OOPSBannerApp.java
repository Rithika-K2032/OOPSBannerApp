
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each line represents one row of the banner
        // Letters: O   O   P   S

        System.out.println(String.join(" ",
                " *** ", " *** ", " **** ", " **** "));

        System.out.println(String.join(" ",
                "*   *", "*   *", "*   *", "*     "));

        System.out.println(String.join(" ",
                "*   *", "*   *", "*   *", "*     "));

        System.out.println(String.join(" ",
                "*   *", "*   *", "**** ", " *** "));

        System.out.println(String.join(" ",
                "*   *", "*   *", "*     ", "    *"));

        System.out.println(String.join(" ",
                "*   *", "*   *", "*     ", "    *"));

        System.out.println(String.join(" ",
                " *** ", " *** ", "*     ", "**** "));
    }
}