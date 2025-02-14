package lesson3.levelB.b1;

import java.util.Scanner;

/*
Напишите программу моделирующую открытие двери домофона по введённому коду. Код открытия двери 1234.
Если пользователь ввёл неправильный код, то сообщить об этом ему и дать возможность снова вводить новы
й код до тех пор, пока он не введёт верный код.

 */
public class Run {
    public static void main(String[] args) {
        String inputCode = printCode();
        String password = "1234";
        while (!inputCode.equals(password)) {
            System.out.println("Код не верный!");
            inputCode = printCode();
        }
        System.out.println("Код верный!");
    }

    private static String printCode() {
        System.out.print("Введите код: ");
        return new Scanner(System.in).nextLine();
    }
}
