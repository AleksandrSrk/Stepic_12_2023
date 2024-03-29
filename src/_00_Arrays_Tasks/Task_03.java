package _00_Arrays_Tasks;

//Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
public class Task_03 {
    public static void main(String[] args) {

        int[] arr = new int[16];
        FillArray(arr);
        EvenNumber(arr);

    }

    public static int[] FillArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        return arr1;

    }

    public static void EvenNumber(int[] arr2) {
        int count = 0;
        String num = "";
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                num = num + arr2[i] + " ";
                count++;
            }
        }
        System.out.println("В массиве " + count + " четных чисел: " + num);
    }

}
