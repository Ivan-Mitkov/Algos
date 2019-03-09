package combinatorics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationWithoutRepSwap {
    public static void main(String[] args) throws IOException {

        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = in.readLine().split(" ");
        int n=elements.length;

        Gen(0,elements);

    }

    private static void Gen(int index,String[] elements) {
        int n = elements.length;
        if(index>=n){
            print(elements);
            return;
        }
        else{
            Gen(index+1,elements);
            for(int i = index+1; i<n; i++){

                Swap(elements, index,i);
                Gen(index+1,elements);
                Swap(elements, index,i);

            }
        }


    }

    private static void Swap(String[] elements, int i, int j) {
        String tmp=elements[j];
        elements[j]=elements[i];
        elements[i]=tmp;

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
