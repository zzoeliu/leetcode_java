package math;

/**
 * Created by ZoeLiu on 7/4/15.
 * Design:
 * Find the total area covered by two rectilinear rectangles in a 2D plane.

 Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 Assume that the total area is never beyond the maximum possible value of int.

 Senarioes division:
 1.no common area
 2.have common area,caculate the common area.,left,right, upper,bottom.

 */
public class RectangleArea {
    public int computeArea(int A,int B,int C, int D,int E,int F, int G,int H)
    {
        int len1=Math.abs(A-C);
        int h1=Math.abs(B-D);

        int len2=Math.abs(E-G);
        int h2=Math.abs(F-H);

        int area1=len1*h1;
        int area2=len2*h2;
        int sum=0;

        if(C<E || G<A || B>H || D<F)
        {//no common area
            sum=area1+area2;
        }else {

            int l = Math.max(A, E);
            int r = Math.min(C, G);
            int u = Math.min(D, H);
            int b = Math.max(B, F);
            int comarea = (r - l) * (u - b);
            sum = area1 + area2 - comarea;
        }
        return sum;
    }
}
