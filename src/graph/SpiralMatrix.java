package graph;

/**
 * Created by ZoeLiu on 9/3/15.
 */
public class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        if(n <= 0) return new int[0][0];
        int[][] result = new int[n][n];
        int i = 0, j = -1;
        int M = n, N = n;
        int m = 1;
        while(true)
        {
            for(int k = 0; k< N; k++)
            {
                result[i][++j] = m++;
            }
            if(--M == 0) break;
            for(int k = 0; k< M; k++)
            {
                result[++i][j] = m++;
            }
            if(--N == 0) break;
            for(int k = 0; k< N; k++)
            {
                result[i][--j] = m++;
            }
            if(--M == 0) break;
            for(int k = 0; k< N; k++)
            {
                result[--i][j] = m++;
            }
            if(--N == 0) break;
        }
        return result;
    }
}
