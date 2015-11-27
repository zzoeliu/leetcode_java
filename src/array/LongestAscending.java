package array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ZoeLiu on 11/8/15.
 */
public class LongestAscending {


     public static class Point {
       public int x;
       public int y;
       public Point(int x, int y) {
         this.x = x;
         this.y = y;
       }
     }
        public int largest(Point[] points) {
            // write your solution here
            //first : sort array in ascending order, then find the longest ascending subsequence by y
            //use dp, dp[i] means longest subsequence till point[i];
            assert(points != null && points.length != 0);
            if(points.length == 1)
                return 1;
            Arrays.sort(points, new Comparator<Point>() {
                public int compare(Point p1, Point p2) {
                    if (p1.x == p2.x)
                        return 0;
                    return p1.x < p2.x ? -1 : 1;
                }
            });
            int len = points.length;
            int[] dp = new int[len];
            dp[0] = 1;
            int global_max = 0;
            for(int i = 1; i < len; i++){
                int local_max = 0;
                for(int j = 0; j < i ; j++){
                    if(points[i].y > points[j].y){
                        local_max = Math.max(local_max,dp[j]);
                    }
                }
                dp[i] = local_max + 1;
                global_max = Math.max(global_max, dp[i]);
            }
            return global_max;
        }
    }


