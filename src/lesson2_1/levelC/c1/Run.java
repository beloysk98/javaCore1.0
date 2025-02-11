package lesson2_1.levelC.c1;

import java.util.Scanner;

/*
В методе main класса Run напишите код для нахождения высоты в разностороннем треугольнике. Длины сторон a, b и c вводятся в консоле.
 Вывести в консоль длину высоты к стороне а. Сделать проверку на корректность ввода длин сторон треугольника.
 */
public class Run {
    public static void main(String[] args) {
        System.out.print("Введите длину стороны ab: ");
        int sideAB = new Scanner(System.in).nextInt();
        System.out.print("Введите длину стороны bc: ");
        int sideBC = new Scanner(System.in).nextInt();
        System.out.print("Введите длину стороны ca: ");
        int sideCA = new Scanner(System.in).nextInt();
        if (sideAB + sideBC > sideCA && sideBC + sideCA > sideAB && sideAB + sideCA > sideBC) {
            //p-полупериметр треугольника
            double p = (double) (sideAB + sideBC + sideCA) / 2;
            System.out.println("Полупериметр: " + p);
            //S-площадь треугольника
            double S = Math.sqrt((p * ((p - sideAB) * (p - sideBC) * (p - sideCA))));
            System.out.println("Площадь треугольника: " + S);
            //h-длина высоты к стороне а с вершины B
            double ha = (2 * S) / sideCA;
            System.out.println("Длина высоты к стороне a: " + ha);

        } else {
            System.out.println("Треугольник с такими сторонами не может быть!");
        }
    }
}
