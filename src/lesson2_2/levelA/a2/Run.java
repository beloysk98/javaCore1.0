package lesson2_2.levelA.a2;

import java.util.Scanner;

/*
В методе main класса Run объявите переменную. Используя класс Scanner проинициализируйте созданную переменную значением от 1 до 7,
 которое вводится с клавиатуры через консоль. Используя оператор if else if напишите код, который будет на основании
 введённого числа выводить в консоль соответствующую текстовую информацию о дне недели.
 */
public class Run {
    public static void main(String[] args) {
        byte numberDay = new Scanner(System.in).nextByte();
        if (numberDay == 1) {
            System.out.println("Понедельник");
        } else if (numberDay == 2) {
            System.out.println("Вторник");
        } else if (numberDay == 3) {
            System.out.println("Среда");
        } else if (numberDay == 4) {
            System.out.println("Четверг");
        } else if (numberDay == 5) {
            System.out.println("Пятница");
        } else if (numberDay == 6) {
            System.out.println("Субота");
        } else if (numberDay == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня недели нет!");
        }
    }
}
