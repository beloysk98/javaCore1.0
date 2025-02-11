package lesson2_2.levelB.b1;

import java.util.Scanner;

/*
В методе main класса Run объявите переменную. Используя класс Scanner проинициализируйте созданную переменную
 значением от 1 до 12, которое вводится с клавиатуры через консоль. Используя оператор if else if  напишите код,
 который будет на основании введённого числа выводить в консоль текстовую информацию: 1, 2, 12 - зима;
  3, 4, 5 - весна; 6, 7, 8 - лето; 9, 10, 11 - осень.
 */
public class Run {
    public static void main(String[] args) {
        System.out.print("Введите номер месяца: ");
        byte numMounth = new Scanner(System.in).nextByte();
        if (numMounth >= 3 && numMounth <= 5) {
            System.out.println("Весна");
        } else if (numMounth >= 6 && numMounth <= 8) {
            System.out.println("Лето");
        } else if (numMounth >= 9 && numMounth <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Зима");
        }
    }
}
