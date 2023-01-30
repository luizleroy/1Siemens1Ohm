import java.util.stream.IntStream;
public class TechnicalChallenges03 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IntStream.range(1, 101).forEach(n -> {
            if (n%3 == 0 && n%5 == 0) {
                System.out.println(n + "FooBaa");
            } else if (n%3 == 0)
            {
                System.out.println("Foo");
            } else if (n%5 == 0) {
                System.out.println("Baa");
            }
        });
    }
}