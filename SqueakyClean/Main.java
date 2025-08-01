package exercism.SqueakyClean;

public class Main {

    public static void main(String[] args) {

        class SqueakyClean {
            static String clean(String identifier) {
                identifier = identifier.replaceAll(" ", "_");
                identifier = identifier.replace("4", "a");
                identifier = identifier.replace("3", "e");
                identifier = identifier.replace("0", "o");
                identifier = identifier.replace("1", "l");
                identifier = identifier.replace("7", "t");
                identifier = identifier.replace("!", "");
                identifier = identifier.replace("¡", "");
                identifier = identifier.replace("$", "");
                identifier = identifier.replace("#", "");
                identifier = identifier.replace(".", "");

                StringBuilder sb = new StringBuilder();
                boolean toUpper = false;

                for (int i = 0; i < identifier.length(); i++) {
                    char c = identifier.charAt(i);

                    if (c == '-') {
                        toUpper = true;
                    } else {
                        if (toUpper) {
                            sb.append(Character.toUpperCase(c));
                            toUpper = false;
                        } else {
                            sb.append(c);
                        }
                    }
                }

                return sb.toString();
            }
        }

        System.out.println(SqueakyClean.clean("aB-c$e"));

    }
}
