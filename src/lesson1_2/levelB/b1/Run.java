package lesson1_2.levelB.b1;

/*
Явное преобразование. В методе main класса Run создайте переменную varInt типа int и присвойте ей число 130.
Создайте переменную varByte типа byte и присвойте ей значение переменной varInt. Напишите код, который будет
выводить значение переменных varInt и varByte в консоль. В многострочном комментарии напишите объяснение почему
 мы получили разные значения переменных varInt и varByte.

 */
public class Run {
    public static void main(String[] args) {
        int varInt = 130;
        byte varByte = (byte) varInt;
        System.out.println(varInt);
        System.out.println(varByte);
        //переменная типа byte может хранить значения только в диапазоне от -128 до 127.
    }
}
