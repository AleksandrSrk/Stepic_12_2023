package _01_Введение;

import java.util.Arrays;
import java.util.Scanner;
// массив целых чисел размером 100 элементов. от 100 до 199
public class ForEach {

    public static void main(String[] args) {
        String[] arr = new String[5];
        int [] array = new int [100];
        FillArr(arr);
        PrintArray(arr);
        PrintArrForEach(arr);
        FillIntArr(array);
        PrintIntArrForEach(array);
    }

    public static String[] FillArr(String[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите по порядку " + array.length + " имен студентов: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
        return array;
    }

    public static int [] FillIntArr (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length + i;
        }
        return arr;
    }

    public static void PrintArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void PrintArrForEach (String[] arr) {
        for (var name : arr) { // Цилк ФорИч - берем по порядку из массива arr данные из каждой ячейки и кладем их в переменную name и выводим
            System.out.println(name);
        }

    }
    public static void PrintIntArrForEach (int [] arr) {
        for (var name : arr) { // Цилк ФорИч - берем по порядку из массива arr данные из каждой ячейки и кладем их в переменную name и выводим
            System.out.print(name + " ");
        }

    }
}
