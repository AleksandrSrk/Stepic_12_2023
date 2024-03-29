package _02_OOP;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(); // мы создали реальный объект, экземпляр класса.
        box1.heigth = 10;
        box1.length = 10;
        box1.width = 10;

        Box box2 = new Box(); // мы создали реальный объект, экземпляр класса.
        box2.heigth = 20;
        box2.length = 20;
        box2.width = 20;

        Box box3 = box2; // мы не создали третий обект, а только переменную, которая ссылается на обьект 2.
        box3.width = 0; // присвоив значение в box3, мы меняем значение у box2!!

// создали объект Box и присвоили его полям характеристики.
        // посчитаем объем коробки:
        double volume = box1.heigth * box1.length * box1.width;
        System.out.println(volume);

        double volume2 = box2.heigth * box2.length * box2.width;
        System.out.println(volume2);
    }
}
