package _01_Введение;

import java.util.Scanner;

// На вход принимает цифру и выводит месяц с этим номером
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");

        int numMonth = sc.nextInt();

        String[] nameMonth = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"};

        PrintNameMonth(numMonth, nameMonth);
//        SwitchCasePrint(numMonth);

        NameSeason(numMonth);
    }

    public static void PrintNameMonth(int num, String[] nameMon) {
        if (num < 1 || num > 12) System.out.println("Введите корректный номер месяца");
        for (int i = 0; i < nameMon.length; i++) {
            if (i == num - 1) {
                System.out.println(nameMon[i]);
            }

        }
    }

//    public static void SwitchCasePrint(int num) {
//        switch (num) {
//            case 1:
//                System.out.println("Jan");
//                break;
//            case 2:
//                System.out.println("Feb");
//                break;
//            case 3:
//                System.out.println("May");
//                break;
//            default:
//                System.out.println("НЕИЗВЕСТНЫЙ МЕСЯЦ");
//
////                И так далее.  В свич принимаем значение с котороым сравниваем, в кейс то с чем сравниваем. Если ок - печать
//
//        }
//    }


    // ДЗ: принимает на вход навание месяца и выводит название сезона, решитьчерез свич кейс

    public static void NameSeason(int nameMonth) {
        switch (nameMonth) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца и сезона");
        }

    }


}
