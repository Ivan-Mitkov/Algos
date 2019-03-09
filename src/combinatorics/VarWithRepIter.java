package combinatorics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VarWithRepIter {
    public static void main(String[] args) throws IOException {

        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = in.readLine().split(" ");
        int m = Integer.parseInt(in.readLine());
        int n=elements.length;
        int[] vector= new int[m];
        Gen(vector,elements);
    }
    private static void Gen(int[] vector,String[] elements) {
        int k=vector.length;
        int n = elements.length;
        while(true){
            print(vector, elements);
            int index = k-1;
            while(index>=0&& vector[index]==n-1){
                index--;
            }
            if(index<0){
                break;
            }
            vector[index]++;
            for(int i = index+1; i<k;i++){
                vector[i]=0;
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
