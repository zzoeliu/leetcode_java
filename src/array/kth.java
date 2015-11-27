package array;

/**
 * Created by ZoeLiu on 11/4/15.
 */
public class kth {
    public int kth(int[] a, int[] b, int k) {
        // write your solution here
        //every time , we will cut the k/2 half that the kth smallest element would not exist in.
        return findkth(a,b,0,0,k);
    }
    public int findkth(int[] a, int[] b, int startA, int startB, int k){
        if(startA >= a.length){
            return b[startB + k - 1];
        }
        if(startB >= b.length){
            return a[startA + k - 1];
        }
        if(k == 1){
            return Math.min(a[startA],b[startB]);
        }
        int midA = startA + k/2 - 1;
        int midB = startB + k/2 - 1;
        int midVA = Integer.MAX_VALUE;
        int midVB = Integer.MAX_VALUE;
        if(midA < a.length){
            midVA = a[midA];
        }
        if(midB < b.length){
            midVB = b[midB];
        }
        if(midA > midB){
            return findkth(a,b,startA,midB + 1, k - k/2);
        }else{
            return findkth(a,b,midA + 1,startB, k - k/2);
        }
    }
}
