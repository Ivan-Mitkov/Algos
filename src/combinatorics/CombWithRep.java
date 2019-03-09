package combinatorics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombWithRep {
    public static void main(String[] args) throws IOException {

        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = in.readLine().split(" ");
        int m = Integer.parseInt(in.readLine());
        int[] vector= new int[m];
        Gen(0,vector,0,elements);
    }

    private static void Gen(int index,int[] vector, int start,String[] elements) {
        int n=elements.length;
        int k=vector.length;
        if(index>=k){
            print(vector,elements);
            return;
        }
        else{

            for(int i = start; i<n; i++){
                vector[index]=i;
                Gen(index+1,vector,i,elements);
            }
        }
    }

    private static void print(int[] vector, String[] elements) {
        for(int i =0; i<vector.length;i++){
            if(i<vector.length-1){
                System.out.printf("%s ",elements[vector[i]]);
            }
            else{
                System.out.printf("%s",elements[vector[i]]);
            }
        }
        System.out.println();
    }
}
