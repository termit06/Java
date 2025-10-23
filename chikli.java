import java.util.Scanner;

public class chikli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите х =");
        double x = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите с =");
        double c = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите у =");
        double y = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите z =");
        double z = Double.parseDouble(scanner.nextLine());

        double h;

        if (y * z > 0 && x > 0) {
            double minEL = y;
            if (minEL > z) {
                minEL = z;
            }
            double maxEL = c;
            if (maxEL < Math.sqrt(x)) {
                maxEL = Math.sqrt(x);
            }
            if (maxEL < minEL) {
                maxEL = minEL;
            }
            h = maxEL;
        } else if (y * z < 0 && x > 0) {
            double minEL = Math.pow(y, 2);
            if (minEL > x) {
                minEL = x;
            }
            h = minEL;
        } else {
            h = 1;
        }

        System.out.println(h);
        scanner.close();
    }
}