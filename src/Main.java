import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1");
        printDigits(5481);

        System.out.println("Task 2");
        int[] arr = {3, 2, 4, 1};
        System.out.println(findSum(arr, arr.length) / arr.length);

        System.out.println("Task 3");
        System.out.println(isPrime(7, 2) ? "Prime" : "Composite");

        System.out.println("Task 4");
        System.out.println(factorial(5));

        System.out.println("Task 5");
        System.out.println(fibonacci(5));

        System.out.println("Task 6");
        System.out.println(power(2, 10));

        System.out.println("Task 7 (Введите 4 числа для теста)");
        // reverseOutput(sc, 4);

        System.out.println("Task 8 ");
        System.out.println(isAllDigits("123456") ? "Yes" : "No");

        System.out.println("Task 9");
        System.out.println(countChars("hello"));

        System.out.println("Task 10");
        System.out.println(gcd(32, 48));
    }

    //Task 1
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    //Task 2
    public static double findSum(int[] arr, int n) {
        if (n <= 0) return 0;
        return findSum(arr, n - 1) + arr[n - 1];
    }

    //Task 3
    public static boolean isPrime(int n, int divisor) {
        if (n <= 2) return n == 2;
        if (n % divisor == 0) return false;
        if (divisor * divisor > n) return true;
        return isPrime(n, divisor + 1);
    }

    //Factorial
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    //Task 5
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Task 6
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    //Task 7
    public static void reverseOutput(Scanner sc, int n) {
        if (n == 0) return;
        int num = sc.nextInt();
        reverseOutput(sc, n - 1);
        System.out.print(num + " ");
    }

    //Task 8
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) return true;
        if (!Character.isDigit(s.charAt(0))) return false;
        return isAllDigits(s.substring(1));
    }

    //Task 9
    public static int countChars(String s) {
        if (s.isEmpty()) return 0;
        return 1 + countChars(s.substring(1));
    }

    //Task 10
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}