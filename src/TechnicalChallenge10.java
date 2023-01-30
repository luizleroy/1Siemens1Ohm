public class TechnicalChallenge10 {
    public static void main(String[] args) {
        String toCalculateSize = null;
        int size = calculaTamanhoString(toCalculateSize.toCharArray());
        System.out.println(size);
    }

    private static int calculaTamanhoString(char[] toCharArray) {
        int target = 0;
        for (char c : toCharArray) {
            target++;
        }
        return target;
    }
}