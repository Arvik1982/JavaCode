import java.util.Scanner;

public class CalculatorTip {
    // static double billAmount = 1000;
    // static double tipPercentage = 10;
    // static int numberOfPeople = 4;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.printf("Введите сумму счёта: ");
            double billAmount = Double.parseDouble(scanner.nextLine().replace(",", "."));

            System.out.printf("Введите процент чаевых: ");
            double tipPercentage = Double.parseDouble(scanner.nextLine().replace(",", "."));

            System.out.printf("Введите количество участников: ");
            int numberOfPeople = Integer.parseInt(scanner.nextLine().replace(",", "."));

            double tipAmount = billAmount * tipPercentage / 100;
            double totalAmount = billAmount + tipAmount;
            double perPersonAmount = totalAmount / numberOfPeople;

            System.out.printf("Сумма счёта: %.2f%n", billAmount);
            System.out.printf("Процент чаевых: %.2f%%%n", tipPercentage);
            System.out.printf("Сколько человек участвовало в обеде: %d%n", numberOfPeople);
            System.out.printf("Общий счёт: %.2f%n", totalAmount);
            // System.out.printf("Процент чаевых: %.2f%%%n", tipAmount);
            System.out.printf("С каждого: %.2f%n", perPersonAmount);
        }
    }
    // @formatter:off
    /**
     * | Заполнитель | Тип             | Пример          |
     * | ----------- | --------------- | --------------- |
     * | %s          | Строка          | %s → "Hello"    |
     * | %d          | Целое           | %d → 42         |
     * | %.2f        | Число (2 знака) | %.2f → 123.45   |
     * | %.2f%%      | Процент         | %.2f%% → 15.00% |
     */
}
