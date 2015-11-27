package recursive;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ZoeLiu on 11/23/15.
 */
public class uneaterLeaves {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = {2,4,5};
        System.out.println(uneatLeaves(N,array));
    }
    public static int uneatLeaves(int n, int[] array){
        //ArrayList<Integer> subset = ;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        int totalEatenLeaves = 0;
        for(int i = 0; i < array.length; i++){
           ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
           for(ArrayList<Integer> subset : result){
               ArrayList<Integer> cur = new ArrayList<Integer>(subset);
               cur.add(array[i]);
               //get lcm for cur
               int lcm = 1;

               for(int j = 0 ; j < cur.size(); j++){
                   lcm = getLCM(lcm, cur.get(j));
               }
               int eatenLeaves = n/lcm;
               totalEatenLeaves += cur.size()%2 == 1 ? eatenLeaves : -eatenLeaves;
               temp.add(cur);
           }
           result.addAll(temp);
        }
        return n - totalEatenLeaves;
    }
    public static int getLCM(int a, int b){
        return a*b/getLCD(a,b);
    }
    public static int getLCD(int a, int b){
        while(b!= 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
