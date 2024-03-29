package _01_Введение;

import java.security.DrbgParameters;
import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;
//        while (count != 0){
//            System.out.print("Введите количество денег: ");
//            int countMoney = sc.nextInt();
//
//            if (countMoney > 50){
//                System.out.println("Еидм устрицы");
//            } else if (countMoney <= 50 && countMoney > 20){
//                System.out.println("Едим колбасу");
//            } else System.out.println("Едим ДОШИК");
//            count -= 1;
//        }
//        BOOLEAN:
//        while (count != 0){
//            System.out.print("Введите температуру: ");
//            int temp = sc.nextInt();
//            System.out.print("Введите время: ");
//            int time = sc.nextInt();
//
//            boolean hot = temp > 25;
//            boolean cold = temp < 25;
//            boolean isNight = time > 22 || time < 6;
//
//            if (hot && !isNight){
//                System.out.println("Кондиционер включен");
//            } else if (cold){
//                System.out.println("Кондиционер выключен");
//            } else System.out.println("Кондиционер ничего не делает");
//            count -= 1;
//        }

        while (count != 0){

            System.out.print("Введите время: ");
            int time = sc.nextInt();

            boolean hot = true;
            boolean cold = false;
            boolean isNight = time > 22 || time < 6;

            if (hot && !isNight){
                System.out.println("Кондиционер включен");
            } else if (cold){
                System.out.println("Кондиционер выключен");
            } else System.out.println("Кондиционер ничего не делает");
            count -= 1;
        }
    }

}
