import java.util.stream.IntStream;
import com.github.saulis.enumerables.Enumerable;

public class Enumer {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1, 30)
//                .filter(x -> x % 2 != 0)
//                .forEach(x -> System.out.println(x));
        Enumerable<Integer>[] evensAndOdds = Enumerable.range(5, 9).split(x -> x % 2 == 0);

        evensAndOdds[1].forEach(x -> System.out.println(x));
//        evensAndOdds[0].forEach(x -> System.out.println(x));

    }
}
