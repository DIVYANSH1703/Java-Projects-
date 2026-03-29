import java.util.*;

public class OOPSBannerApp {

    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = map.get(c);
                line.append(pattern[i]).append("  ");
            }

feature/UC8
            System.out.println(line);
        }

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(
                    String.join("   ",
                            O[i],
                            O[i],
                            P[i],
                            S[i]
                    )
            );
        }
    }

    
    public static String[] getO() {
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

    
    public static String[] getP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    public static String[] getS() {
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

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        renderBanner(word, patterns);
    }
}