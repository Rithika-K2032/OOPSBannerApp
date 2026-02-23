import java.util.*;

class BannerPattern {

    // Map to store character patterns
    private Map<Character, String[]> patternMap = new HashMap<>();

    // Constructor loads patterns
    public BannerPattern() {
        patternMap.put('O', new String[]{
                "******* ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "******* "
        });

        patternMap.put('P', new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        });

        patternMap.put('S', new String[]{
                " ****** ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        });
    }

    // Method to generate banner lines
    public String[] generateBanner(String text) {

        int height = 7;
        String[] bannerLines = new String[height];

        for (int i = 0; i < height; i++) {

            List<String> rowParts = new ArrayList<>();

            for (char ch : text.toCharArray()) {
                String[] letter = patternMap.get(ch);
                rowParts.add(letter[i]);
            }

            bannerLines[i] = String.join(" ", rowParts);
        }

        return bannerLines;
    }

    // Method to print banner
    public void printBanner(String text) {
        String[] banner = generateBanner(text);

        for (String line : banner) {
            System.out.println(line);
        }
    }
}

public class OOPSBannerApp {
    public static void main(String[] args) {

        BannerPattern banner = new BannerPattern();

        System.out.println("=== OOPS Banner ===\n");
        banner.printBanner("OOPS");
    }
}