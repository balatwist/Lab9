package Question4;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Square {

    public static void printSquares(int num) {
        Stream.iterate(1, i -> i + 1)
                .map(i -> i * i)
                .limit(num)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSquares(4);
    }

}
