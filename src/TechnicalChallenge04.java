public class TechnicalChallenge04 {
    public static void main(String[] args) {
        char s[] = {'e','s','s'};
        char t[] = {'t','e','e'};
        concat(s, 'm');
        remove(t);
    }

    public static char[] remove(char[] m) {
        char[] target = new char[m.length - 1];
        for (int i = 0; i < m.length - 1; i++) {
            target[i] = m[i];
        }
        return target;
        //Runtime.getRuntime().gc();
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
