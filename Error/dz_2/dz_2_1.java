package Error.dz_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dz_2_1 {
    public static void main(String[] args) {
        boolean flag = true;
        float pages = 0;
        System.out.println("введите дробное число");
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            try {
                pages = scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("НЕВЕРНЫЙ ВВОД! (" + e + ") Введите дробное число");
            }
        }
        System.out.println(pages);
    }
}
