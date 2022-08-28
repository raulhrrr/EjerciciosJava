public class PrintFunction {
    public static void main(String[] args) {
        int x, y;
        x = 0;
        y = 0;
        while (x <= 10) {
            y = (x * x * x) + (x * x) - 5;
            System.out.println("" + x + " <=> " + y);
            x += 1;
        }

        x = 0;
        y = 0;
        do {
            y = (x * x * x) + (x * x) - 5;
            System.out.println("" + x + " <=> " + y);
            x += 1;
        } while (x <= 10);

        x = 0;
        y = 0;
        for (x = 1; x <= 10; x++) {
            y = (x * x * x) + (x * x) - 5;
            System.out.println("" + x + " <=> " + y);
        }
    }
}
