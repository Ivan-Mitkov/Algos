package recursion;

public class PrintFigure {
    public static void main(String[] args) {
        PrintF(4);
    }

    static void PrintF(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(new String(new char[n])
                        .replace('\0', '*'));

        PrintF(n-1);

        System.out.println(new String(new char[n])
                .replace('\0', '#'));
    }
}
