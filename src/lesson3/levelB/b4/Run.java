package lesson3.levelB.b4;

import java.util.Arrays;
import java.util.Scanner;

/*
Написать программу, в которой в консоле мы вводим число, а она говорит какое это число, простое или составное.
 */
public class Run {
    public static void main(String[] args) {
        int inputNum = new Scanner(System.in).nextInt();
        int statusNum = 0;
        for (int i = 1; i <= inputNum; i++) {
            if (inputNum % i == 0) {
                statusNum++;
            }
        }
        if (statusNum <= 2) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число составное");
        }
    }
}
