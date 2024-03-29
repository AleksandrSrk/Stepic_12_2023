package _01_Введение;

public class Loop {
    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 1000) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//            if (i == 10) break;
//        }

//        do {
//            System.out.println("Hello");
//        } while (i < 0);

        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) System.out.println(i);
        }
    }

}
