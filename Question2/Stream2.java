package Question2;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {


      Stream<Integer> myIntStream= Stream.of(23,12,34,60,2,11,55,30,27);
        System.out.println("Maximum :" +myIntStream.max(Integer::compareTo).orElse(null));


        myIntStream=Stream.of(23,12,34,60,2,11,55,30,27);
        System.out.println("Minimum :" +myIntStream.min(Integer::compareTo).orElse(null));


    }
}
