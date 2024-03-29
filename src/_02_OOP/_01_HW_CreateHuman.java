package _02_OOP;

// создать класс человек с полями имя возраст и вес, потом создать три обьекта человек. и вывести их средний возраст.
public class _01_HW_CreateHuman {
    public static void main(String[] args) {
        Human Vasya = new Human();
        Vasya.weigth = 170;
        Vasya.age = 30;
        Vasya.name = "Вася";

        Human Petya = new Human();
        Petya.weigth = 180;
        Petya.age = 35;
        Petya.name = "Петя";

        Human Dima = new Human();
        Dima.weigth = 150;
        Dima.age = 38;
        Dima.name = "Дима";

        double middleAge = (Vasya.age + Petya.age + Dima.age) / 3.0;
        System.out.println(middleAge);

    }
}
