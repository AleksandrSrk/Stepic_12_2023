package _01_Введение;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
//        char x = 88;
//        char x1 = 'X';
//        x1++;
//        System.out.println("asd " + x);
//        System.out.println(x1);
        FillName();
    }
    public static void FillName  () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое имя: ");
        String a = sc.next();
        System.out.print("Введите возраст " + a + ": ");
        int ageA = sc.nextInt();

        System.out.print("Введите второе имя: ");
        String b = sc.next();
        System.out.print("Введите возраст " + b + ": ");
        int ageB = sc.nextInt();

        System.out.print("Введите третье имя: ");
        String  c = sc.next();
        System.out.print("Введите возраст " + c + ": ");
        int ageC = sc.nextInt();

        System.out.println("Возраст " + a + " " + ageA + "; " + "возраст " + b + " " + ageB + "; " + "возраст " + c + " " + ageC);

    }
}


