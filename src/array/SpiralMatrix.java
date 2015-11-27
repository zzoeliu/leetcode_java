package array;

/**
 * Created by ZoeLiu on 9/22/15.
 */
public class SpiralMatrix {
    public int[] spiral(int[][] matrix) {
       /* // write your solution here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        dfsHelper(matrix, 0, 0, 0, result,0);
        return result;
    }
    private void dfsHelper(int[][] matrix, int xStart, int yStart, int count, int[] result, int rStart){
        if (count > matrix.length/2)
            return;
        int n = count;
        int y = yStart;
        while(n > 0){
            result[rStart++] = matrix[xStart][y++];
            n--;
        }
        n = count;
        int x = xStart;
        while(n > 0){
            result[rStart++] = matrix[x++][matrix.length - count];
            n--;
        }
        n = count;
        y = matrix.length - count;
        while(n > 0){
            result[rStart++] = matrix[matrix.length - count][y--];
            n--;
        }
        n = count;
        x = matrix.length - count;
        while(n > 0){
            result[rStart++] = matrix[x--][count];
            n--;
        }
        dfsHelper(matrix,xStart + 1, yStart + 1,count + 1, result, rStart);*/
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = m - 1;
        int[] result = new int[m * n];
        int r = 0;
        while(left < right && up < down){
            for(int i = left; i < right; i++){
                result[r++] = matrix[up][i];
            }
            for(int i = up; i < down; i++){
                result[r++] = matrix[i][right];
            }
            for(int i = right; i > left; i--){
                result[r++] = matrix[down][i];
            }
            for(int i = down; i > up; i--){
                result[r++] = matrix[i][left];
            }
            left++;
            right--;
            up++;
            down--;
        }
        if(left > right || up > down)
            return result;
        if(left == right){
            while(up <= down){
                result[r++]=matrix[left][up++];
            }
        }else{
            while(left <= right){
                result[r++] = matrix[left++][up];
            }
        }
        return result;
    }
}
