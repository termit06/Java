import java.util.Scanner;

public class vetlenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите а = ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите b = ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите с = ");
        double c = Double.parseDouble(scanner.nextLine());

        double La = bis(a, b, c);

        System.out.println(La);
    }

    public static double bis(double A, double B, double C) {
        double la = (Math.sqrt(B * C * Math.pow(B + C, 2) - Math.pow(A, 2))) / (B + C);
        return la;
    }
}