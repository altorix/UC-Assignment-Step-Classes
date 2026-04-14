public class OOPSBannerApp {

    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

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

    public static String[] getPPattern() {
        return new String[]{
            " ****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        CharacterPatternMap oChar = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap pChar = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap sChar = new CharacterPatternMap('S', getSPattern());

        CharacterPatternMap[] characters = { oChar, oChar, pChar, sChar };

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap cp : characters) {
                lineBuilder.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}