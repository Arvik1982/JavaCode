import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш вес в килограммах: ");

        double weight = Double.parseDouble(scanner.nextLine().replace(",", "."));

        System.out.println("Введите ваш рост в метрах: ");

        double height = Double.parseDouble(scanner.nextLine().replace(",", "."));

        double bmi = weight / (Math.pow(height, 2));

        System.out.printf("Ваш индекс массы тела (ИМТ): %.2f%n ", bmi);
        System.out.println("Меньше 18.5 - Недостаточный вес\n" + "18.5 - 24.9 - Нормальный вес\n"
                + "25 - 29.9 - Избыточный вес\n" + "30 и более - Ожирение\n" + "");

    }

}