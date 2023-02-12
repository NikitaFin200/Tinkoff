import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String str = null;

        for (int i = 0; i < num; i++) {
            str = scanner.nextLine();
            char ch = scanner.next().charAt(0);
        }

        int t = Integer.parseInt(str);
        System.out.println(t);
    }
}

