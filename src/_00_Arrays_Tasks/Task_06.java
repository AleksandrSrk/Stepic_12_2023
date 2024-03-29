package _00_Arrays_Tasks;

import java.util.Arrays;
import java.util.Random;

//Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
//Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
// Сделал что заполняет до тех пор пока последовательность не станет возрастающей

public class Task_06 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rand = new Random();

        do {
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(10, 1000);
            }
        }
        while (ChekUp(array)); {
            System.out.println(Arrays.toString(array));
            System.out.println("Последовательность возрастает");
        }
    }

    public static boolean ChekUp(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}