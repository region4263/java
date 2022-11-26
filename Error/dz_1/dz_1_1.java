package Error;

//    реализация трех методов с разными исключениями
public class dz_1_1 {

    public static void main(String[] args){
        divizionZero();
        indexOut();
        arrStore(-5);
    }

//    деление на ноль
    private static void divizionZero() {
        int x = 10;
        int y = 0;
        int sum = x / y;
        System.out.println(sum);
    }

//    выход индекса за границу массива
    private static void indexOut() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);
    }

//    передача в метод не верного аргумента
    private static void arrStore(int x) {
        if (x < 0) {
            throw new RuntimeException("Необходимо передавать положительное значение");
        }
        int[] arr = new int[x];
        System.out.println(arr);
    }

}
