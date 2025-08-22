
import java.util.stream.*;

public class StreamReduce {

    public static Integer sumAll(Stream<Integer> s) {
        return s.collect(Collectors.summingInt(Integer::intValue));
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        return s.map((a) -> a / divider).collect(Collectors.summingInt(Integer::intValue));
    }
}
