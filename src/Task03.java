import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод предложения
        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine();

        // Разделение предложения на слова
        String[] words = sentence.split(" ");

        // Подсчет суммарной длины слов
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }

        // Вычисление средней длины слова
        int averageLength = totalLength / words.length;

        // Вывод результата
        System.out.println("Средняя длина слова: " + averageLength);
    }
}