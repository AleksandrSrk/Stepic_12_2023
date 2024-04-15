package CodeWars;

import java.util.Scanner;

//Тимми и Сара думают, что они влюблены, но в тех местах, где они живут, они узнают об этом только после того, как сорвут по цветку.
//Если у одного из цветов четное количество лепестков, а у другого нечетное, это означает, что они влюблены.
//Напишите функцию, которая будет считать количество лепестков каждого цветка и возвращать значение true,
//если они влюблены, и значение false, если это не так.
public class Test_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество лепестков ПЕРВОГО цветка: ");
        int flower1 = scanner.nextInt();
        System.out.print("Введите количество лепестков ВТОРОГО цветка: ");
        int flower2 = scanner.nextInt();

        isLove(flower1, flower2);





        }
    public static boolean isLove(final int flower1, final int flower2) {
        boolean flag = true;
        if ((flower1 + flower2) % 2 != 0){
            System.out.println("Они влюблены " + flag);
            return true;
        }
        flag = false;
        System.out.println("Они НЕ влюблены " + flag);
        return false;

    }

}
