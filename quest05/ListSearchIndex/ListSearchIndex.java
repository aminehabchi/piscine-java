
import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {

    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        int i = list.lastIndexOf(value);
        if (i == -1) {
            return null;
        }
        return i;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        int i = list.indexOf(value);
        if (i == -1) {
            return null;
        }
        return i;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> l = new ArrayList<>();
        if (list == null) {
            return l;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                l.add(i);
            }
        }
        return l;
    }
}
