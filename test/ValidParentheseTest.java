//import math.CountPrime;
import array.*;
//import array.kthsmall;
import dp.ArrayHopper;
import dp.arrayHopper2;
import dp.*;
import graph.Bipartite;
import graph.CourseSchedule;
import graph.SpiralMatrix;
import math.CommonElementsInThree;
import math.*;
import math.TwoSum;
import math.isNumber;
import recursive.NQueens;
import stack.simplePath;
import sort.MergeSort2;
import sort.QuickSort;
import sort.RainbowSort;
import sort.SelectionSort;
import stack.EvaluateReversePolishNotation;
import string.*;
import sort.sortColors;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import string.Solution;
import tree.*;
//import stack.ValidParentheses;
//import string.IsomorphicStrings;


/**
 * Created by ZoeLiu on 7/2/15.
 */
public class ValidParentheseTest {
    public static void main(String[] args) {
        int[] nums = {0,9,5,7,3};
        segmentTree test = new segmentTree(nums);
        System.out.println(test.sumRange(4,4));
        System.out.println(test.sumRange(2,4));
        System.out.println(test.sumRange(3,3));
        test.update(4,5);
        test.update(1,7);
        test.update(0,8);
        System.out.println(test.sumRange(1,2));
        test.update(1,9);
        System.out.println(test.sumRange(4,4));
        System.out.println(test.sumRange(3,4));
    }
}

        /*String s = "MMDCCXC";
        Roman2Integer rom2Int=new Roman2Integer();
        int result=rom2Int.RomanInteger(s);

        System.out.println(s+" is :"+ result);*/

        /*String s="]";
        ValidParentheses test=new ValidParentheses();
        System.out.println("The result is "+ test.isValid(s));*/
        /*IsomorphicStrings test=new IsomorphicStrings();
        String s="aa";
        String t="ab";
        System.out.println(test.isIsomorphic(s,t));*/
        //CountPrime test=new CountPrime();
        //int count=test.countPrimes(5);
        //ZigzagConv test=new ZigzagConv();
        //String input="ABCD";
        //String output=new String();
        //output=test.convert(input,3);
        //System.out.println(output);

//        StringToInteger testClass=new StringToInteger();
        //      String test="2147483648";
        //    int num=testClass.myAtoi(test);
        //  System.out.println(num);
        // MinStack test=new MinStack();
        //test.push(-3);
        //int min=test.getMin();
        //System.out.println(min);
        //RectangleArea test=new RectangleArea();
        //int area=test.computeArea(-2, -2, 2, 2, 3, 3, 4, 4);
        //System.out.println(area);

        //HapplyNumber test=new HapplyNumber();

        //test.isHappy(19);
        //ReverseInteger test=new ReverseInteger();
        //test.reverse(2147483412);
        //CompareVersionNumbers test=new CompareVersionNumbers();
        //String a="1";
        //String b="0";
        //test.compareVersion(a,b);
        //LongestCommonPrefix test=new LongestCommonPrefix();
        //String[] testString={"a"};
        //String result = test.longestCommonPrefix(testString);
        //PascalTriangle test=new PascalTriangle();
        // test.generate(1);
        //       CountAndSay test=new CountAndSay();
        //       int n=10;
        //       test.countAndSay(n);
        //PlusOne test=new PlusOne();
        // int[] r={0};
        //test.plusOne(r);
//        CourseSchedule test=new CourseSchedule();
//        int[][] pre={{1,0}};
//        test.canFinish(2,pre);
//        FindMinimumInRotatedSortedArray test=new FindMinimumInRotatedSortedArray();
//        int[] nums={1,2};
//        test.findMin(nums);
//        MaxProductSubarray test=new MaxProductSubarray();
//        int[] nums={-4,-3};
//        test.maxProduct(nums);
        //EvaluateReversePolishNotation test=new EvaluateReversePolishNotation();
        //String[] tokens={"0","3","/"};
        //System.out.println(test.evalRPN(tokens));
//        PermutationSequence test=new PermutationSequence();
//        test.getPermutation(2,2);
       /* QuickSort test=new QuickSort();
        int[] array={0};
        int[] array1={1, 2, 3};
        int[] array2={3, 2, 1};
        int[] array3={4, 2, -3, 6, 1};
        array=test.quickSort(array3);
        for(int i=0;i<array3.length;i++)
            System.out.println(array3[i]);*/

//        CommonElementsInThree test = new CommonElementsInThree();
//        int[] a={1, 2, 2, 3};
//        int[] b={2, 2, 3, 5};
//        int[] c={2, 2, 4};
//        List<Integer> results= test.common(a,b,c);
//        for(int i=0; i< results.size();i++)
//        {
//            System.out.println(results.get(i));
//        }
//        WildCard test = new WildCard();
//        String a = "aa";
//        String b = "a*";
//        System.out.println(test.isMatch(a,b));
//        simplePath test = new simplePath();
  //      System.out.println(test.simplifyPath("/."));
 //       sortColors test = new sortColors();
 //       int[] nums = {2,0};
 //       test.sortColors(nums);
        // DeDup test = new DeDup();
        //String large = "aabccdc";
        //String small = "pp()";
        //int[] coin = {5,2,1};
        //System.out.println(test.deDup(large));
        //result = test.topKFrequent(array, 2);
        //for(int i = 0; i < result.length; i++) {
        //    System.out.println(result[i]);
        //}
//        Anagram test = new Anagram();
//        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        String str1 = "aa";
//        String str2 = "baaaa";
//        List<Integer> result = test.allAnagrams(str1,str2);
//        for(int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i));
//        }
        //stringReplace test = new stringReplace();
        //DecompressString test = new DecompressString();
        //array.SpiralMatrix test = new array.SpiralMatrix();
        /*int[][] matrix = {{1,  2,  3,  4},

        {5,  6,  7,  8},

        {9, 10, 11, 12}};*/
        /*NQueens test = new NQueens();
        List<List<Integer>> result = test.nqueens(5);
        //String str= "abcabcbbcda";
        //int[] result = test.spiral(matrix);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }*/
        //toHex test = new toHex();
        //System.out.println(test.hex(0));
       // isNumber test = new isNumber();
        //System.out.println(test.isNumber("0"));
         //dictWord test = new dictWord();
        //String[] array ={"bob","cat","rob"};
        //String word = "robob";
        //int[] array = {1, 3, 2, 0, 2};
        //System.out.println(test.canBreak(word,array));
        //uglyNumber test= new uglyNumber();
        //System.out.println(test.nthUglyNumber(15));

        //preOrder test = new preOrder();
        //int[] array = {};
        //System.out.println(test.isBST(array));
        //secondLargest test = new secondLargest();
        //longestSubSeq test = new longestSubSeq();
        //int[] array = {5, 2, 6, 3, 4, 7, 5};
        //int[] array1 = {2,4,3,1};
        //test.longest(array);
        //constructLevel test = new constructLevel();
        //int[] level = {1,2};
        //int[] in = {1,2};
        //test.reconstruct(in ,level);
       //kth test = new kth();
       // int[] a = {1,4,5,5,8,12,12,12};
       // int[] b = {2,2,3,7,9,9,9};
       // test.kth(a,b,14);
        //Scanner in = new Scanner(System.in);

        /*List<Integer> input = new ArrayList<Integer>();
        int q = 0;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            q = Integer.parseInt(br.readLine());
        //int q = in.nextInt();
            //int tuples = in.nextInt();
            int tuples = Integer.parseInt(br.readLine());
            for(int i = 0; i < tuples; i++){
                String[] str = br.readLine().split(" ");
                int number = Integer.parseInt(str[0]);
                int count = Integer.parseInt(str[1]);
                //int number = in.nextInt();
                //int count = in.nextInt();
                while(count != 0){
                    input.add(number);
                    count--;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        int n = input.size();
        int[] array = new int[n + 1];
        for(int i = 1; i <= n; i++){
            array[i] = input.get(i - 1);
        }
        Arrays.sort(array);
        quatile test = new quatile();
        System.out.println(test.getQuatile(array,q));*/
        /*List<Integer> input = new ArrayList<Integer>();
        //int q = 0;

            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //q = Integer.parseInt(br.readLine());
        Scanner in = new Scanner(System.in);
            int q = in.nextInt();
            int tuples = in.nextInt();
            //int tuples = Integer.parseInt(br.readLine());
            for(int i = 0; i < tuples; i++){
                //String[] str = br.readLine().split(" ");
                //int number = Integer.parseInt(str[0]);
                //int count = Integer.parseInt(str[1]);
                int number = in.nextInt();
                int count = in.nextInt();
                while(count != 0){
                    input.add(number);
                    count--;
                }
            }
        int n = input.size();
        int[] array = new int[n + 1];
        for(int i = 1; i <= n; i++){
            array[i] = input.get(i - 1);
        }
        Arrays.sort(array);
        quatile test = new quatile();
        System.out.println(test.getQuatile(array,q));*/
        /*LongestAscending.Point[] points = new LongestAscending.Point[3];
        for(int i = 0; i < 3; i++){
            points[i] = new LongestAscending.Point(i,i+1);
        }
        LongestAscending test = new LongestAscending();
        System.out.println(test.largest(points));*/
        /*kthsmall test = new kthsmall();
        int[] A = {1,3,5,8,9};
        int[] B = {2,3,4,7};
        test.kthSum(A,B,7);*/
        /*List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);
        List<Integer> b = new ArrayList<Integer>();
        b.add(3);
        b.add(4);
        b.add(2);
        b.add(2);
        b.add(2);
        Common test = new Common();
        System.out.println(test.common(a,b));*/
        //String a = "aaaabbbc";
        //DedupII test = new DedupII();
        //System.out.println(test.deDup(a));
        //int[][] a = new int[][]{{0,1,1,1},{1,1,0,1},{0,1,0,1},{1,1,1,1}};
        //max1s test = new max1s();
        //System.out.println(test.largest(a));
        //double[][] matrix = new double[][]{{-0.5, -0.2, -0.3, -1.0}, {-0.4, -0.4, -1.0, -0.4}, {-0.1, -0.1, -0.8, -0.2}};
        //largestMatrix test = new largestMatrix();
        //spiral test = new spiral();
        /*int[][] result = test.spiralGenerate(9);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(result[i][j]);
            }
        }*/
        //smallPairs test = new smallPairs();
        //int[] array = {2,3,4};
        //System.out.println(test.smallerPairs(array,7));
       // Solution test = new Solution();
        //test.
  //  }
//}
