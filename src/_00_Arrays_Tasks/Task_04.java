package _00_Arrays_Tasks;

//Создайте массив из 8 случайных целых чисел из отрезка [1;10].
//Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
public class Task_04 {
    public static void main(String[] args) {

        int[] arr = new int[8];
        FillArray(arr);
        Replaces(arr);

    }

    public static int[] FillArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10) + 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        return arr1;

    }

    public static void Replaces(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");

        }
    }

}
