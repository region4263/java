package Error.dz_2;

public class dz_2_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int catchedRes1 = intArray[8] / 2;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
