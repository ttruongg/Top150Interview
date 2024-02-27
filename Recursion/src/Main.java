import java.util.Scanner;

public class Main {

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return factorial(n - 1) * n;
    }

    public static int fibonaci(int n) {
        if (n < 2)
            return n;
        else
            return fibonaci(n - 1) + fibonaci(n - 2);

    }

    public static int exponential(int cs, int sm) {
        if (sm == 0)
            return 1;
        else {
            return cs * exponential(cs, sm - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter n: ");
        int n;
        Scanner scanin = new Scanner(System.in);
        n = scanin.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
        System.out.println("Fibonaci of " + n + " is " + fibonaci(n));
        for (int i = 0; i < n; i++) {
            System.out.println(fibonaci(i));
        }

        System.out.println("Enter cs and sm: ");
        int a = scanin.nextInt();
        int b = scanin.nextInt();
        System.out.println(exponential(a, b));
    }
}