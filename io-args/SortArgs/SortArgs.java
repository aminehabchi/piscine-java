
import java.util.Collections;
import java.util.Vector;

public class SortArgs {

    public static void sort(String[] args) {
        Vector<Integer> arr = new Vector<>();
        for (String a : args) {
            arr.add(Integer.parseInt(a));
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i != arr.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
