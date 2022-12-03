package Error.dz_2;

import java.util.Scanner;

public class dz_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pages;
        pages = scanner.nextLine();
        if (pages.isEmpty()) {
            throw new RuntimeException("пустые строки вводить нельзя");
        }

    }
}
