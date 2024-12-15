package app;

public class Main {
    public static void main(String[] args) {

        // Ініціалізація змінних
        int totalSum = 0; // Для зберігання загальної суми чисел

        // Перебираємо числа від 1 до 6
        for (int i = 1; i <= 6; i++) {
            totalSum += i; // Додаємо поточне
            // число до загальної суми
            System.out.println(i + ") Num is " + i + ", sum is " + totalSum);
        }

        // Виводимо загальну суму
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + totalSum);
    }
}
