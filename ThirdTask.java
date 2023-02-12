import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество телескопов");
        int n = scanner.nextInt();
        System.out.println("Количество звезд");
        int m = scanner.nextInt();
        System.out.println("Количество режимов");
        int k = scanner.nextInt();

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }


    }
}
