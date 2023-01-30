public class TechnicalChallenge04 { //
    public static void main(String[] args) {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        concatRemove(s,t,8);
    }

    // PRINCIPAL ALGORITHM
    private static void concatRemove(char[] s, char[] t, int k) {

        s = remove(s);
        s = remove(s);
        s = remove(s);
        s = remove(s);
        s = remove(s);
        s = concat(s,t[0]);
        s = concat(s,t[1]);
        s = concat(s,t[2]);
        System.out.println(k);
        System.out.println(s);
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
