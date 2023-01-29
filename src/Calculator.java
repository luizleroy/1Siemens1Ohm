import java.util.Arrays;
import java.util.stream.DoubleStream;
public class Calculator {

    public static void concatRemove(char[] s, char[] t, int k) {
        System.out.println(Arrays.copyOf(s, k));
    }
     public static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }
}
