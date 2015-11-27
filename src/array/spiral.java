package array;

/**
 * Created by ZoeLiu on 11/17/15.
 */
public class spiral {
    public int[][] spiralGenerate(int n) {
        // write your solution here
        assert(n >= 0);
        if(n == 0){
            return new int[0][0];
        }
        int sqrt = (int)Math.sqrt(n);
        int len = sqrt;
        int[][] result = new int[len][len];
        int count = 1;
        int i = 0, j = 0;
        while(len >= 0 && count <= n){
            int k = len;
            while(k > 1){
                result[i][j++] = count++;
                k--;
            }
            k = len;
            while(k > 1){
                result[i++][j] = count++;
                k--;
            }
            k = len;
            while(k > 1){
                result[i][j--] = count++;
                k--;
            }
            k = len;
            while(k > 1){
                result[i--][j] = count++;
                k--;
            }
            len -= 2;
            i++;
            j++;
        }
        if(len == -1){
            result[sqrt/2][sqrt/2] = count;
        }
        return result;
    }
}
