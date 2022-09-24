public class TablaMultiplicar {
    public static void main(String[] args) {
        int a = 4, b = 0, c = 0;
        while (b < 10) {
            b += 1;
            c = a * b;
            System.out.println("" + a + " * " + b + " = " + c);
        }

        b = 0;
        c = 0;
        do {
            b += 1;
            c = a * b;
            System.out.println("" + a + " * " + b + " = " + c);
        } while (b < 10);

        b = 0;
        c = 0;
        for (b = 1; b <= 10; b++) {
            c = a * b;
            System.out.println("" + a + " * " + b + " = " + c);
        }
    }
}
