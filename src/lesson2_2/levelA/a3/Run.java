package lesson2_2.levelA.a3;

import java.util.Scanner;

/*
В методе main класса Run объявите переменную. Используя класс Scanner проинициализируйте созданную переменную значением
от 1 до 7, которое вводится с клавиатуры через консоль. Используя оператор switch напишите код, который будет на
основании введённого числа выводить в консоль текстовую информацию: 1 - Понедельник, 2 - Вторник, 3 - Среда, 4 - Четверг,
 5 - Пятница, 6 и 7 - Выходной.

 */
public class Run {
    public static void main(String[] args) {
        byte numberDay = new Scanner(System.in).nextByte();
        switch (numberDay) {
            case 1:
                System.out.println("1 - понедельник");
                break;
            case 2:
                System.out.println("2 - вторник");
                break;
            case 3:
                System.out.println("3 - среда");
                break;
            case 4:
                System.out.println("4 - четверг");
                break;
            case 5:
                System.out.println("5 - пятница");
                break;
            case 6:
                System.out.println("6 - субота");
                break;
            case 7:
                System.out.println("7 - воскресенье");
                break;
            default:
                System.out.println("Такого дня недели нет !");
                break;

        }

    }
}
