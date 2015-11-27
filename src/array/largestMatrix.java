package array;

import java.util.Arrays;

/**
 * Created by ZoeLiu on 11/17/15.
 */
public class largestMatrix {
    public double largest(double[][] matrix) {
        // write your solution here
        assert(matrix != null && matrix.length != 0 && matrix[0].length != 0);
        int row = matrix.length;
        int col = matrix[0].length;
        double max = Integer.MIN_VALUE;
        for(int i = 0; i < row; i++){
            double[] colProd = new double[col];

            Arrays.fill(colProd, 1.0);
            for(int j = i; j >= 0; j--){
                for(int k = 0; k < col; k++){
                    colProd[k]*= matrix[j][k];
                }
                double local_min = colProd[0];
                double local_max = colProd[0];
                double row_max = colProd[0];
                for(int k = 1; k < col; k++){
                    double temp = local_max;
                    local_max = Math.max(Math.max(colProd[k],local_max * colProd[k]),local_min * colProd[k]);
                    local_min = Math.min(Math.min(colProd[k],temp * colProd[k]),local_min * colProd[k]);
                    row_max = Math.max(row_max,local_max);
                }
                max = Math.max(max,row_max);
            }
        }
        return max;
    }
}
