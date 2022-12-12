import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        int of = sc.nextInt();
        int x = 0;
        int f = 0;

        while (x < o) {
            if (x != 0) {
                System.out.println(x);
                System.out.println(Math.pow(x, 5));
            }
            x += 4;

        }
    }
}