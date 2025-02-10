package lesson1_2.levelC.c3;

/*
Создать класс Container, который может хранить в себе один любой объект. Реализовать методы setContent и getContent
для сохранения и извлечения этого объекта. Создать класс Run и в методе main создать 2 объекта класса Container,
сохранить значение в этом классе, вывести это значение в консоль.
 */
public class Run {
    public static void main(String[] args) {
        Container c1 = new Container();
        Container c2 = new Container();
        c1.setContent("Первое значение");
        c2.setContent(2 + 3);
        System.out.println(c1.getContent());
        System.out.println(c2.getContent());
    }

}
