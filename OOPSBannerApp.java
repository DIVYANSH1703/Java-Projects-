import java.util.*;

public class OOPSBannerApp {

    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = map.get(c);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
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