package lesson3.levelA.a3;

/*
В методе main класса Run напишите код для нахождения суммы чисел от 1 до 10.

 */
public class Run {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i <= 10; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
