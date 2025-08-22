
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if (list==null){
            return null;
        }
        List<Integer> ah = new ArrayList<>(list);
        Collections.sort(ah);
        return ah;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list==null){
            return null;
        }
        List<Integer> ah = new ArrayList<>(list);
        Collections.sort(ah, Collections.reverseOrder());
        return ah;
    }
}
