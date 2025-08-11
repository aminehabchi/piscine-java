public class StringReplace {
    public static String replace(String s, char target, char replacement) {
        if (s == null) {
            return "";
        }
        return s.replace(target, replacement);
    }

    public static String replace(String s, String target, String replacement) {
        if (s == null) {
            return "";
        }
        if (target == null || replacement == null) {
            return s;
        }
        return s.replace(target, replacement);
    }
}
