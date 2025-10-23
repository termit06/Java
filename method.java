public class method {
    public static void main(String[] args) {
        double y;

        // Using for loop
        for (double x = -1; x <= 1; x += 0.1) {
            y = Math.pow(2, -x) * Math.exp(x);
            System.out.println(y);
        }

        System.out.println("-----------------------------------");

        // Using while loop
        double x = -1;

        while (x <= 0.1) {
            y = Math.pow(2, -x) * Math.exp(x);
            x += 0.1;
            System.out.println(y);
        }

        System.out.println("-----------------------------------");

        // Using do-while loop
        x = -1;

        do {
            y = Math.pow(2, -x) * Math.exp(x);
            x += 0.1;
            System.out.println(y);
        } while (x <= 1);
    }
}