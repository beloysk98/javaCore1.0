package lesson2_1.levelA.a1;

/*
Создать две переменные типа int и проинициализировать их значениями 4 и 3. Написать код,
 который выводит в консоль их сумму, разность, произведение, частное.
 */
public class Run {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Частное: " + a / b);
        System.out.println("Произведение: " + a * b);
    }
}
