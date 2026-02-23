import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y;
        if (x > 2) {
            y = (Math.pow(x, 2) - 1) / (x + 2);
        }
        else if (x > 0 & x <= 2) {
            y = (Math.pow(x, 2) - 1) + (x + 2);
        }
        else {
            y = Math.pow(x, 2) * (1 + 2 * x);
        }
        System.out.println(y);
    }
}
