package _00_Arrays_Tasks;

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
//а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

public class Task_02 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        FillArray(arr);
        PrintArray(arr);
        PrintNegativArray(arr);

    }

    public static int[] FillArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        return arr1;
    }

    public static void PrintArray (int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (i %2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void PrintNegativArray (int[] arr3) {
        for (int i = arr3.length; i > 0; i--) {
            if (i %2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


}
