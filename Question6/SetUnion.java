package Question6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUnion {

    public static Set<String> union(List<Set<String>> sets) {
        return sets.stream()
                .reduce(new HashSet<>(), (set1, set2) -> {
                    Set<String> union = new HashSet<>(set1);
                    union.addAll(set2);
                    return union;
                });
    }

    public static void main(String[] args) {
        List<Set<String>> sets = List.of(
                Set.of("A", "B"),
                Set.of("D"),
                Set.of("1", "3", "5")
        );

        Set<String> result = union(sets);
        System.out.println(result);
    }
}
