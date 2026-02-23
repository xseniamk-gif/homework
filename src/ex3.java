public class ex3 {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int f = 1 + y;  // f может остаться int

        // Меняем тип на double
        double t = (y + 1.0 / (Math.pow(x, 2) - 4));
        double s = 2 * x + Math.pow(y, 2) - (x + y) / t;

        System.out.println(f * s);
    }
}