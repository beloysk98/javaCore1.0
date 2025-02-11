package lesson2_1.levelB.b3;

import java.util.Scanner;

/*
В методе main класса Run напишите программу для нахождения длины гипотенузы прямоугольного треугольника по теореме Пифагора.
 Длины катетов вводим в консоли. Длину гипотенузы вывести в консоль.
 c = √(a² + b²) формула
 */
public class Run {
    public static void main(String[] args) {
        System.out.print("Введите первую длину катета: ");
        int firstValue = new Scanner(System.in).nextInt();
        System.out.print("Введите первую длину катета: ");
        int secondValue = new Scanner(System.in).nextInt();
        System.out.println("Длина гипотенузы: " + Math.sqrt((firstValue * firstValue) + (secondValue * secondValue)));
    }
}

