public class TechnicalChallenge04 { //
    public static void main(String[] args) {
        char t[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char s[] = {'c','d','e'};
        concatRemove(t,s,8);
    }

    // PRINCIPAL ALGORITHM
    public static void concatRemove(char[] t, char[] s, int k) {
        if(k < 0 || k > 100 || s.length > k) {
            System.out.println("no");
            return;
        }
        System.out.println(t);
        for (int i = 0; i < k-s.length; i++) {
            t = remove(t);
        };
        for (int i = 0; i < s.length; i++) {
            t = concat(t,s[i]);
        }
        System.out.println(t);
        System.out.println("yes");
        //To big data in string... Runtime.getRuntime().gc();
    }

    public static char[] remove(char[] m) {
        if (m.length - 1 < 1) {
            return new char[0];
        }
        char[] target = new char[m.length - 1];
        for (int i = 0; i < m.length - 1; i++) {
            target[i] = m[i];
        }
        return target;
        //To big data in string... Runtime.getRuntime().gc();
    }

    public static char[] concat(char[] m, char n) {
        char[] target = new char[m.length + 1];
        for (int i = 0; i < m.length; i++) {
            target[i] = m[i];
        }
        target[m.length] = n;
        return target;
        //Runtime.getRuntime().gc();
    }
}
