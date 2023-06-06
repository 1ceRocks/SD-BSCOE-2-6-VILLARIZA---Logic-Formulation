/* Fibonacci Series (VILLARIZA | BSCOE 2-6 2022-2023)
Software Design (CMPE 30074)

(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55) */

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1, total;
        System.out.println("First " + n + " terms: ");
        for(int i=0; i<=n; i++) {
            System.out.print(t1 + ", ");
            total = t1 + t2; t1 = t2; t2 = total;
        }
    }
}