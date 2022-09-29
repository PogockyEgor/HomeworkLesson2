import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        {//1 задание
            int month = 65;
            switch (month) {
                case 12, 1, 2:
                    System.out.println("Сейчас зима");
                    break;
                case 3, 4, 5:
                    System.out.println("Сейчас весна");
                    break;
                case 6, 7, 8:
                    System.out.println("Сейчас лето");
                    break;
                case 9, 10, 11:
                    System.out.println("Сейчас осень");
                    break;
                default:
                    System.out.println("Неверный номер месяца");
            }
        }

        {//2 задание
            int month = 9;
            if (month == 12 && month == 1 && month == 2) {
                System.out.println("Сейчас зима");
            } else if (month > 2 && month < 6) {
                System.out.println("Сейчас весна");
            } else if (month > 5 && month < 9) {
                System.out.println("Сейчас лето");
            } else if (month > 8 && month < 12) {
                System.out.println("Сейчас осень");
            } else {
                System.out.println("Неверный номер месяца");
            }
        }

        {//3 задание
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
        }

        {//4 задание
            int temperature = -19;
            if (temperature > -5) {
                System.out.println("Тепло");
            } else if (temperature < -5 && temperature > -20) {
                System.out.println("Нормально");
            } else System.out.println("Холодно");
        }

        //циклы

        {//1 задание
            for (int i = 0; i < 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        {//2 задание
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
            }
        }

        {//3 задание
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое положительное число");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Введенное число не является положительным или целым");
            } else {
                int result = 0;
                for (int i = 1; i <= number; i++) {
                    result = result + i;
                }
                System.out.println("Сумма всех чисел от " + 1 + " до " + number + " равна " + result);
            }
        }

        {//4 задание
            int i = 0;
            while (i < 98) {
                System.out.println(i = i + 7);
            }
        }

        {//5 задание
            for (int i = 0; i > -50; i = i - 5) {
                System.out.println(i);
            }
        }

        {//6 задание
            for (int i = 10; i < 21; i++) {
                System.out.println((int) Math.pow(i, 2));
            }
        }


    }
}