package _00_Arrays_Tasks;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
public class Task_05 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        FillArray(arr1);
        FillArray(arr2);
        System.out.println(AriphmeticMean(arr1));
        System.out.println(AriphmeticMean(arr2));
        Comparison(AriphmeticMean(arr1), ArrToString(arr1), AriphmeticMean(arr2), ArrToString(arr2));


    }

    public static int[] FillArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10) + 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        return arr1;

    }

    public static int AriphmeticMean(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum = sum + arr[i];
        }
        return sum / count;
    }

    public static String ArrToString(int[] arr) {
        String stringArr = "";
        for (int i = 0; i < arr.length; i++) {
            stringArr = stringArr + arr[i] + " ";
        }
        return stringArr.trim();
    }

    public static void Comparison(int a, String arrA, int b, String arrB) {
        if (a > b) {
            System.out.println("Среднее арифметическое массива \"" + arrA + "\" равно " + a + " и больше значения " + b + " из массива \"" + arrB + "\"");
        } else if (b > a) {
            System.out.println("Среднее арифметическое массива \"" + arrB + "\" равно " + b + " и больше значения " + a + " из массива \"" + arrA + "\"");
        } else System.out.println("Среднее арифметическое массивов \"" + arrB + "\" и \"" + arrA + "\" равны " + a);
    }
}
