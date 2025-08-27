import java.util.List;
import java.util.Map;

public class ExerciseRunner {

    public static void main(String[] args) {
        // 5 men and 5 women, each with 5 choices
        Map<String, List<String>> menPreferences = Map.of(
                "Naruto", List.of("Sakura", "Hinata", "Tsunade", "Ino", "Kushina"),
                "Sasuke", List.of("Hinata", "Sakura", "Kushina", "Tsunade", "Ino"),
                "Kakashi", List.of("Ino", "Tsunade", "Sakura", "Hinata", "Kushina"),
                "Shikamaru", List.of("Tsunade", "Ino", "Hinata", "Kushina", "Sakura"),
                "RockLee", List.of("Kushina", "Hinata", "Ino", "Sakura", "Tsunade")
        );

        Map<String, List<String>> womenPreferences = Map.of(
                "Sakura", List.of("Sasuke", "Naruto", "Shikamaru", "RockLee", "Kakashi"),
                "Hinata", List.of("Naruto", "Sasuke", "Kakashi", "Shikamaru", "RockLee"),
                "Tsunade", List.of("Kakashi", "Shikamaru", "RockLee", "Naruto", "Sasuke"),
                "Ino", List.of("Shikamaru", "Kakashi", "Naruto", "Sasuke", "RockLee"),
                "Kushina", List.of("RockLee", "Naruto", "Shikamaru", "Sasuke", "Kakashi")
        );

        Map<String, String> result = WeddingComplex.createBestCouple(menPreferences, womenPreferences);

        System.out.println("Matching Result:");
        result.forEach((man, woman) -> System.out.println(man + " ↔ " + woman));
    }
}
