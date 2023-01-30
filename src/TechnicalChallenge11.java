public class TechnicalChallenge11 {
    public static void main(String[] args) {
        // boundary condition:
        //char s[] = null;
        // to test
        //char s[] = {'a'};
        //char s[] = {'a','\n'};
        //char s[] = {'1','2'};
        //char s[] = {'1','2','3'};
        char s[] = {'a','b','c','d','.','.','.','z'};
        if(s == null) {
            return;
        }
        // complex O(n/2)
        for (int i = 0; i < s.length/2; i++) {
            char tmp = s[i];
            s[i] = s[(s.length - 1)-i];
            s[(s.length - 1)-i] = tmp;
        }
        // IMPORTANT OBS: the variables `tmp' and `i' are on the machine's stack (JVM)
        System.out.println(s);
        // using only one array in memory!
        // draft...
//        System.out.println("\nexample with numbers...");
//        int x = 1;
//        int y = 2;
//        x = x + y;
//        y = x - y;
//        x = x - y;
//        System.out.println("After swapping:"
//                + " x = " + x + ", y = " + y);
    }
}
