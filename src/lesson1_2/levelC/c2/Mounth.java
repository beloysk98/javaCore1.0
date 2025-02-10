package lesson1_2.levelC.c2;

/*
Создайте enum класс с перечислением месяцев года. Создайте метод, который на вход принимает значение месяца,
а на выходе отдаёт пору года. В методе main класса Run вызовите этот метод и выведите в консоль
результат работы этого метода.

 */
public enum Mounth {
    DECEMBER("Декабрь "), JANUARY("Январь"), FEBRUARY("Февраль"), MARCH("Март"), APRIL("Апрель"), MAY("Май"),
    JUNE("Июнь"), JULY("Июль"), AUGUST("Август"), SEPTEMBER("Сентябрь"), OCTOBER("Октябрь"), NOVEMBER("Ноябрь"),
    WINTER("Зима"), AUTUMN("Весна"), SUMMER("Лето"), SPRING("Осень");
    final String info;

    Mounth(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public static Mounth getSeason(Mounth myEnum) {

        switch (myEnum) {
            case DECEMBER, JANUARY, FEBRUARY:
                return Mounth.WINTER;

            case MARCH, APRIL, MAY:
                return Mounth.AUTUMN;

            case JUNE, JULY, AUGUST:
                return Mounth.SUMMER;

            case SEPTEMBER, OCTOBER, NOVEMBER:
                return Mounth.SPRING;

        }
        return null;
    }
}
