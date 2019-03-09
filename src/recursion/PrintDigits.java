package recursion;

public class PrintDigits {
    public static void main(String[] args) {
        printN(728341234);
    }

    static void printN(int n) {
        if (n >=10) {
            printN(n / 10);
        }

        System.out.printf("%d ", n % 10);
    }
}
