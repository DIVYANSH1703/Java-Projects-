import java.util.*;

public class OOPSBannerApp {

    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        char getCharacter() {
            return character;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {


        List<CharacterPatternMap> list = new ArrayList<>();

        list.add(new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }))

        list.add(new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        list.add(new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        Map<Character, String[]> map = new HashMap<>();

        for (CharacterPatternMap cp : list) {
            map.put(cp.getCharacter(), cp.getPattern());
        }

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(map.get(c)[i]).append("  ");
            }

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
}