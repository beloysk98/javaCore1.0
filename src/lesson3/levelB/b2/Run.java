package lesson3.levelB.b2;

import java.util.Scanner;

/*
Написать программу вычисляющую факториал натурального числа n, которое вводится с клавиатуры в консоле.

 */
public class Run {
    public static void main(String[] args) {
        int factorial = new Scanner(System.in).nextInt();
        int sum = 1;
        for (int i = 2; i <= factorial; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
