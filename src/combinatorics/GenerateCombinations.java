package combinatorics;

import java.util.Arrays;

public class GenerateCombinations {
    public static void main(String[] args) {
        int n = 3;
        int[] vector = new int[n];
//        Gen01(0, vector);
        int[] set={1,2,3};
        int k=3;
        int[]kset=new int[k];
//        GenCombination(set,kset,0,0);
        boolean[] used=new boolean[set.length];
        int[] perm=new int[set.length];
        permutationsWithoutRepetion(set,used,perm,0);
    }

    static void Gen01(int index, int[] vector) {
        if (index >= vector.length) {
            System.out.println(Arrays.toString(vector));
            return;
        }
        else{
            for (int i = 0; i <=1 ; i++) {
                vector[index]=i;
                Gen01(index+1,vector);
//                vector[index]=3;
//                System.out.println(Arrays.toString(vector));
            }

        }
//        vector[index] = 1;
//        Gen01(index + 1, vector);
//        vector[index]=2;
//        System.out.println(Arrays.toString(vector));
    }

    static void GenCombination(int[] set, int[] vector,int index, int border){
       if(index>=vector.length){
           System.out.println(Arrays.toString(vector));
           return;
       }
       else{
           for (int i = border; i < set.length; i++) {
               vector[index]=set[i];
               GenCombination(set,vector,index+1,i+1);
           }
       }
    }

    static void permutationsWithoutRepetion(int[] elements,boolean[] used,int[] perm,int index){

        if(index>=elements.length){
            System.out.println(Arrays.toString(perm));
        }
        else{
            for (int i = 0; i <elements.length ; i++) {
                if(!used[i]){
                    used[i]=true;
                    perm[index]=elements[i];
                    permutationsWithoutRepetion(elements,used,perm,index+1);
                    used[i]=false;
                }
            }
        }
    }
}
