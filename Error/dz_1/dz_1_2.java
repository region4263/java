package Error;

import java.util.Arrays;
import java.util.Random;

public class dz_1_2 {

    public static void main(String[] args){
        method1(4, 4);
        System.out.println("====================");
        method1(4, 5);
    }

    private static void method1(int a, int b) {
        if (a != b) {
            throw new RuntimeException("длина массивов не одинаковая (" + a + " и " + b + ")");
        }
        Random rnd = new Random();

        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            int x = rnd.nextInt(9);
            arr1[i] = x;
        }

        int[] arr2 = new int[a];
        for (int i = 0; i < b; i++) {
            int x = rnd.nextInt(9);
            arr2[i] = x;
        }
        System.out.println("arr1 - " + Arrays.toString(arr1));
        System.out.println("arr2 - " + Arrays.toString(arr2));

        int[] arrSum = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrSum[i] = arr1[i] - arr2[i];
        }
        System.out.println("результат - " + Arrays.toString(arrSum));

    }

}

