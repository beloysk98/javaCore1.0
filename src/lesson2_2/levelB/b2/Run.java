package lesson2_2.levelB.b2;

import java.util.Scanner;

/*
В методе main класса Run используя тернарный оператор напишите код, который считывает с консоли введённое число и
после проверки на чётность выводит в консоль информацию об этом числе.
 */
public class Run {
    public static void main(String[] args) {
        System.out.print("Введите число для проверки на четность: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println((a % 2 == 0) ? "Четное" : "Не четное");
    }

}
