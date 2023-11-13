package Question5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        return stream
                .skip(m)
                .limit(n - m + 1);
    }

    public static void main(String[] args) {

        Stream<String> result1 = streamSection(nextStream(), 2, 4);
        result1.forEach(System.out::println);

        Stream<String> result2 = streamSection(nextStream(), 0, 2);
        result2.forEach(System.out::println);

        Stream<String> result3 = streamSection(nextStream(), 1, 5);
        result3.forEach(System.out::println);
    }


    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
    }
}
