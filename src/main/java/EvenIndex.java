import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class EvenIndex {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 7, 1, 3, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(value -> value % 2 == 1)
                .forEach(System.out::println);
    }
}