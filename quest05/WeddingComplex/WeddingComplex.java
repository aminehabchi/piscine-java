import java.util.*;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(
            Map<String, List<String>> first,
            Map<String, List<String>> second) {

        // Make mutable copies
        Map<String, List<String>> firstCopy = new HashMap<>();
        first.forEach((k, v) -> firstCopy.put(k, new ArrayList<>(v)));

        Map<String, List<String>> secondCopy = new HashMap<>();
        second.forEach((k, v) -> secondCopy.put(k, new ArrayList<>(v)));

        Map<String, String> couples = new HashMap<>();
        int maxSize = Math.max(firstCopy.size(), secondCopy.size());
        int i = 0;
        while (!firstCopy.isEmpty() && !secondCopy.isEmpty()) {
            boolean bb = false;
            for (String k : new ArrayList<>(firstCopy.keySet())) {
                String a = getFirst(firstCopy, k, i);
                if (a == null) {
                    continue;
                }
                String b = getFirst(secondCopy, a, 0);
                if (b == null) {
                    continue;
                }
                if (b.equals(k)) {
                    couples.put(k, a);
                    removeFromList(firstCopy, k);
                    removeFromList(firstCopy, a);
                    removeFromList(secondCopy, k);
                    removeFromList(secondCopy, a);
                    bb = true;
                    break;
                }
            }
            if (!bb) {
                i++;
            } else {
                i = 0; // Reset index when we find a match
            }

            if (i >= maxSize) {
                break;
            }
        }

        return couples;
    }

    public static String getFirst(Map<String, List<String>> m, String r, int index) {
        List<String> n = m.get(r);

        if (n != null && !n.isEmpty() && index < n.size()) {
            return n.get(index);
        }
        return null;
    }

    public static void removeFromList(Map<String, List<String>> m, String r) {
        m.remove(r);
        for (List<String> l : m.values()) {
            l.remove(r);
        }
    }
}