import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого числа
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        // Ввод второго числа
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        // Вычисления
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;;

        // Вывод результатов
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}