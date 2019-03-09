package combinatorics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VarWithoutRep {
    public static void main(String[] args) throws IOException {

        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = in.readLine().split(" ");
        int m = Integer.parseInt(in.readLine());
        int n=elements.length;
        String[] vector= new String[m];
        boolean [] used = new boolean[n];
        Gen(0,vector,n,m,elements,used);

    }

    private static void Gen(int index,String[] vector,int n, int m,String[] elements, boolean[]used) {
        if(index>=m){
            print(vector);
            return;
        }
        else{
            for(int i = 0; i<n; i++){
                if (!used[i])
                {
                    used[i] = true;
                    vector[index]=elements[i];
                    Gen(index+1,vector,n,m,elements,used);
                    used[i] = false;
                }
            }
        }
    }
    private static void print(String[] vector) {
        for(int i =0; i<vector.length;i++){
            if(i<vector.length-1){
                System.out.printf("%s ",vector[i]);
            }
            else{
                System.out.printf("%s",vector[i]);
            }
        }
        System.out.println();
    }

}
