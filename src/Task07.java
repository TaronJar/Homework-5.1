import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Замена букв и цифр
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isDigit(c)) {
                result += "_";
            } else {
                result += c;
            }
        }

        // Вывод результата
        System.out.println("Результат: " + result);
    }
}