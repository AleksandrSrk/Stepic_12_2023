package _00_Arrays_Tasks;

//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один элемент от другого пробелом,
//а затем в столбик (отделяя один элемент от другого началом новой строки). Перед созданием массива подумайте, какого он будет размера.
//2 4 6 … 18 20
//        2
//        4
//        6
//        …
//        20

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        FillArray(arr);
        ArrayString(arr);
        System.out.println();
        System.out.println();
        ArrayColumn(arr);

    }

    public static int[] FillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void ArrayString(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
    }

    public static void ArrayColumn(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }

}
