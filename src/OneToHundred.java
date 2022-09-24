public class OneToHundred {
    public static void main(String[] args) {
        int n, s;
        n = 0;
        s = 0;
        while (n < 100) {
            n += 1;
            s += n;
            System.out.println(n);
        }
        System.out.println(s);

        n = 0;
        s = 0;
        do {
            n += 1;
            s += n;
            System.out.println(n);
        } while (n < 100);
        System.out.println(s);

        n = 0;
        s = 0;
        for (n = 1; n <= 100; n++) {
            s += n;
            System.out.println(n);
        }
        System.out.println(s);
    }
}
