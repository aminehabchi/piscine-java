
import java.util.*;
import java.util.stream.*;

public class StreamMap {

    public static Integer sumOfStringLength(Stream<String> s) {
        return s.collect(Collectors.summingInt(String::length));
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(String::toUpperCase).collect(Collectors.toList());
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(a -> a > 42).map(Double::intValue)
                .collect(Collectors.toSet());
    }
}
