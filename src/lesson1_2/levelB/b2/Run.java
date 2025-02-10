package lesson1_2.levelB.b2;

/*
В методе main класса Run создайте переменную а типа int со значением 1 и переменную b типа int со значением 2.
Выведите в консоль результат математической операции a/b. Сверьте результат из консоли с калькулятором,
он должен быть одинаковым!
 */
public class Run {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a / b);
        //при типе int во время деления отбрасывается дробная часть
        double a1 = 1;
        double b1 = 2;
        System.out.println(a1 / b1);
    }
}
