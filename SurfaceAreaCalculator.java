import java.util.Scanner;

public class SurfaceAreaCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Введите радиус основания");
            double baseRadius = Double.parseDouble(scanner.nextLine().replace(",", "."));
            System.out.println("Введите высоту цилиндра: ");
            double height = Double.parseDouble(scanner.nextLine().replace(",", "."));

            double surface = 2 * Math.PI * baseRadius * (baseRadius + height);
            double volume = Math.PI * Math.pow(baseRadius, 2);

            System.out.printf("Площадь поверхности цилиндра: %.2f%n", surface);
            System.out.printf("Объем цилиндра: %.2f%n", volume);

        }
    }
}
