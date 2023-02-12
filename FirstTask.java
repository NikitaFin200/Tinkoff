import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char zn = '?';
        System.out.println("Enter string");
        String str = scanner.nextLine();

        char[] arr = str.toCharArray();

        int[] arrInt = new int[arr.length];

        for(int i=0;i<arrInt.length;i++) {
            arrInt[i] = arr[i] - '0';
        }

        String answer="YES";

        for(int i=1;i< arrInt.length;i++){
            if (arrInt[i] > arrInt[i - 1]) {
                answer = "NO";
                break;
            }
        }

        int max = 9;
        int min = 0;

        int randQuantity = (int) (Math.random() * ((max - min) + 1) + min);

        for (int i = 0; i < randQuantity; i++) {
            int maxStr = str.length();
            int randPlace = (int) (Math.random() * ((maxStr - min) + 1) + min);
            arr[randPlace] = zn;
        }

        str = String.valueOf(arr);
        System.out.println(str);
        System.out.println(answer);
    }
}
