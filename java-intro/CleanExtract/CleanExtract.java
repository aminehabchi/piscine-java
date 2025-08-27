import java.util.Arrays;
import java.util.Vector;

public class CleanExtract {
    public static String[] removeFirstNElements(String[] arr, int n) {
        if (arr == null || n >= arr.length) {
            return new String[0];
        }
        return Arrays.copyOfRange(arr, n, arr.length);
    }

    public static String extract(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String[] arr = s.split("\\|");
        Vector<String> out = new Vector<>();

        for (String part : arr) {
            part = part.trim();
            if (part == null || part.isEmpty()) {
                continue;
            }

            if (!part.contains(".")) {
                out.add(part.trim());
            } else {
                int firstDot = part.indexOf('.');
                int lastDot = part.lastIndexOf('.');

                if (firstDot == lastDot) {
                    String middle = part.substring(firstDot + 1).trim();
                    if (!middle.isEmpty()) {
                        out.add(middle);
                    }
                } else if (firstDot < lastDot) {
                    String middle = part.substring(firstDot + 1, lastDot).trim();
                    if (!middle.isEmpty()) {
                        out.add(middle);
                    }
                } else {
                    out.add(part);
                }
            }
        }

        String result = String.join(" ", out).trim();

        return result;
    }
}