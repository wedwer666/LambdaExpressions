import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonaciNumbers {
    public static List<Integer> generate(int numbers) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(numbers)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(FibonaciNumbers.generate(30)); // Test the code.
    }
}



