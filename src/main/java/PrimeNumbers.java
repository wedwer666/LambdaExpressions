import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeNumbers {
    public static void main(String args[])
    {
        IntStream.rangeClosed(1, 100)
        .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                .allMatch(j -> i%j != 0))
                .forEach(n -> {
                    System.out.println(n);
                });

    }
}
