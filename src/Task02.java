import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа n
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        // Создание строки с целыми числами
        StringBuilder stringBuilder = new StringBuilder();
        int number = 1;
        while (stringBuilder.length() < n) {
            stringBuilder.append(number);
            number++;
        }

        // Вывод цифры на позиции n
        char digit = stringBuilder.charAt(n - 1);
        System.out.println("Цифра на позиции " + n + ": " + digit);
    }
}