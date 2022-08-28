public class NumberAndFactorial {
    public static void main(String args[]) {
        int n = 0, f = 1;
        while (n < 10) {
            n += 1;
            f *= n;
            System.out.println("" + n + " <=> " + f);
        }

        n = 0;
        f = 1;
        do {
            n += 1;
            f *= n;
            System.out.println("" + n + " <=> " + f);
        } while (n < 10);

        n = 0;
        f = 1;
        for (n = 1; n <= 10; n++) {
            f *= n;
            System.out.println("" + n + " <=> " + f);
        }
    }
}