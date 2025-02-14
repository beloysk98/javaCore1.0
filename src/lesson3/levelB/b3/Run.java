package lesson3.levelB.b3;

import java.util.Scanner;

/*
Написать программу для вывода в консоль n первых чисел Фибоначчи. Число n вводится в консоле.
 */
public class Run {
    public static void main(String[] args) {
        int inputNumber = new Scanner(System.in).nextInt();
        int numFib1 = 0;
        int numFib2 = 1;

        for (int i = 0; i < inputNumber; ++i) {
            System.out.println(numFib1 + " ");
            int nextNumFib = numFib1 + numFib2;
            numFib1 = numFib2;
            numFib2 = nextNumFib;

        }
    }
}
