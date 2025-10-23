import java.util.Scanner;

public class posledovatelnost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x = ");
        double x = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите y = ");
        double y = Double.parseDouble(scanner.nextLine());

        double a = (14 * Math.sin(x) + Math.pow(y, 2)) / (0.92 * Math.pow(Math.cos(x), 3));

        System.out.println(a);
    }
}