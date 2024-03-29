package _00_Arrays_Tasks;
public class Arrays {
    public static void main(String[] args) {
//        String [] namesOfMonths = new String[12];
//        namesOfMonths[0] = "Январь";
//        namesOfMonths[1] = "Февраль";
//        namesOfMonths[2] = "Март";
//        namesOfMonths[3] = "Апрель";
//        namesOfMonths[4] = "Май";
//        namesOfMonths[5] = "Июнь";
//        namesOfMonths[6] = "Июль";
//        namesOfMonths[7] = "Август";
//        namesOfMonths[8] = "Сентябрь";
//        namesOfMonths[9] = "Октябрь";
//        namesOfMonths[10] = "Ноябрь";
//        namesOfMonths[11] = "Декабрь";
//        for (int i = 0; i < namesOfMonths.length; i++) {
//            if (i == namesOfMonths.length-1){
//                System.out.print(namesOfMonths[i] + ".");
//            } else System.out.print(namesOfMonths[i] + ", ");
//        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - i - 1] + " ");

        }

    }
}
