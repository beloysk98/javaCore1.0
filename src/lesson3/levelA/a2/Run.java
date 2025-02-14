package lesson3.levelA.a2;

/*
В методе main класса Run объявите переменную и проинициализируйте её значением 10. Используя цикл while выведите
значение этой переменной в консоль и уменьшайте на 1 до тех пор, пока значение этой переменной не станет равно 0.

 */
public class Run {
    public static void main(String[] args) {
        int a = 10;
        while (a < 11 && a != -1) {
            System.out.println(a--);
        }
    }
}
