package lesson2_2.levelA.a1;

/*
В методе main класса Run написать код, который будет сравнивать значения переменных a и b.
 После сравнения вывести в консоль информацию значение какой переменной больше.
 */
public class Run {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        if (a > b) {
            System.out.println(a + " больше " + b);
        } else if (a < b) {
            System.out.println(a + " меньше " + b);
        } else {
            System.out.println(a + " равно " + b);
        }
    }
}
