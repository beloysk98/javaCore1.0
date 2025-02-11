package lesson2_1.levelB.b2;

import java.util.Scanner;

/*
В методе main класса Run объявите переменную. Используя класс Scanner проинициализируйте созданную переменную значением,
 которое вводится с клавиатуры через консоль. Напишите код, который возводит в третью степень число, которое мы ввели в
  консоли, и выведите результат в консоль.
 */
public class Run {
    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println(Math.pow(a, 3));
    }
}
