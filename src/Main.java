public class Main {
        /*public static void main3(String[] args) {
            System.out.println("Hello world!");
            IntStream.range(1, 101).forEach(n -> {
                if (n%3 == 0 && n%5 == 0) {
                    System.out.println(n + "FooBaa");
                } else if (n%3 == 0)
                {
                    System.out.println(n + "Foo");
                } else if (n%5 == 0) {
                    System.out.println(n + "Baa");
                }
                });
        }*/

        //-------------------------------
        public static void main(String[] args) {
            System.out.println("start 4");
            char[] s = {'b','l','a','b','l','a','b','l','a','b','l','a'};
            char[] t = {'b','l','a','b','l','a','b','c','d','e'};
            int k = 8;
            Calculator.concatRemove(s,t,k);
        }
}