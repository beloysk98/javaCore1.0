package lesson2_2.levelB.b3;

import java.util.Scanner;

/*
В методе main класса Run напишите код для нахождения корней квадратного уравнения, коэффициенты a, b и c вводить через консоль.
 */
public class Run {
    public static void main(String[] args) {
        printinfo();
        int a = new Scanner(System.in).nextInt();
        printinfo();
        int b = new Scanner(System.in).nextInt();
        printinfo();
        int c = new Scanner(System.in).nextInt();
        int discriminant = (b * b) - (4 * a * c);
        if (discriminant > 0) {
            System.out.println("Дискриминант положительный, поэтому уравнение имеет два различных корня.");
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Первый корень: " + root1 + ", второй корень: " + root2);
        } else if (discriminant < 0) {
            System.out.println("Дискриминант отрицательный, корней нет");
        } else {
            System.out.println("Дискриминант равен нулю — корень будет один");
            double root3 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корень равен: " + root3);
        }
    }

    private static void printinfo() {
        System.out.println("Введите значение: ");
    }
}
