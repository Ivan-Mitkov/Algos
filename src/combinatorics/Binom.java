package combinatorics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binom {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int k = Integer.parseInt(in.readLine());
        System.out.print( binom(n,k));
    }

    private static int binom(int n, int k) {
        if(k>n)return 0;
        if(k==n)return 1;
        if(k==0) return 1;
        return binom(n-1,k-1)+binom(n-1,k);

    }
}
