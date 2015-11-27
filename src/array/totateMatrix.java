package array;

/**
 * Created by ZoeLiu on 10/21/15.
 */
public class totateMatrix {
    public void rotate(int[][] matrix) {
        // write your solution here
        //Solution 1 : 90 clockwise rotaion could be achieved by folding centered with negative diagonal
        //then fold centered with middle row, but this method limited by N*N matrix
        if(matrix == null || matrix.length <=1 || matrix[0].length <= 1){
            return;
        }
        int n = matrix.length;
        //step 1: fold by negative diagonal(i,j) to (n - j - 1, n -i - 1)
   /*for(int i = 0; i < matrix.length; i++)
     for(int j = 0; j < n - i; j++){
       int temp = matrix[i][j];
       matrix[i][j] = matrix[n - j -1][n - i - 1];
       matrix[n- j -1][n - i - 1] = temp;

   }
  //Step 2: fold by middle row
  for(int i = 0; i < matrix.length/2; i++)
     for(int j = 0; j < n; j++){
       int temp = matrix[i][j];
       matrix[i][j] = matrix[n- i -1][j];
       matrix[n- i -1][j] = temp;

   }*/
        //Solution 2. Do rotation by rotating each item in 1/4 matrix
   /*int halfN = (n%2 == 0) ? n/2 : n/2 + 1;
   for (int i = 0; i < halfN; i++)
   for (int j = 0; j < n/2; j++){
     int temp = matrix[i][j];
     matrix[i][j] = matrix[n - j - 1][i];
     matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
     matrix[n - i - 1][n - j - 1] = matrix[j][n-1-i];
     matrix[j][n-1-i] = temp;
   }*/
        //Solution 3: rotate the small triangle composed of level, n - level - 2
        for (int level = 0; level < n/2; level++){
            int left = level;
            int right = n - 2 - level;
            while(left <= right){
                int temp = matrix[level][left];
                matrix[level][left] = matrix[n - left - 1][level];
                matrix[n - left - 1][level] = matrix[n - level - 1][n - left - 1];
                matrix[n - level - 1][n - left - 1] = matrix[left][n - level - 1];
                matrix[left][n - level - 1] = temp;
                left++;
            }
        }
    }
}
