public class TechnicalChallenge11 {
    public static void main(String[] args) {
        // test numbers...
        int x = 1;
        int y = 2;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
    }
}
