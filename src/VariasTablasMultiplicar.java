public class VariasTablasMultiplicar {
    public static void main(String[] args) {
        int a = 4, b = 0, c = 0;
        while (a < 7) {
            while (b < 10) {
                b = b + 1;
                c = a * b;
                System.out.println("" + a + "*" + b + "=" + c);
            }
            a = a + 1;
            b = 0;
            c = 0;
        }
        System.out.println("\n");

        a = 4;
        b = 0;
        c = 0;
        do {
            do {
                b = b + 1;
                c = a * b;
                System.out.println("" + a + "*" + b + "=" + c);
            } while (b < 10);
            a = a + 1;
            b = 0;
            c = 0;
        } while (a < 7);
        System.out.println("\n");

        a = 0;
        b = 0;
        c = 0;
        for (a = 4; a <= 6; a++) {
            for (b = 1; b <= 10; b++) {
                c = a * b;
                System.out.println("" + a + "*" + b + "=" + c);
            }
        }
    }
}