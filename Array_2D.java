/*
>>>Task

Given a 6X6 2D Array,arr :

   1 1 1 0 0 0
   0 1 0 0 0 0
   1 1 1 0 0 0
   0 0 0 0 0 0
   0 0 0 0 0 0
   0 0 0 0 0 0
An hourglass in A is a subset of values with indices falling in this pattern in arr's graphical representation:

   a b c
     d
   e f g
There are 16 hourglasses in arr. An hourglass sum is the sum of an hourglass' values. 
Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum. 
The array will always be 6X6.

>>>Example

arr=
   -9 -9 -9  1 1 1 
    0 -9  0  4 3 2
   -9 -9 -9  1 2 3
    0  0  8  6 6 0
    0  0  0 -2 0 0
    0  0  1  2 4 0
The 16 hourglass sums are:

   -63, -34, -9, 12, 
   -10,   0, 28, 23, 
   -27, -11, -2, 10, 
     9,  17, 25, 18
The highest hourglass sum is 28 from the hourglass beginning at row 1, column 2:

   0 4 3
     1
   8 6 6

>>>Function Description
Complete the function hourglassSum in the editor below.
hourglassSum has the following parameter(s):
   int arr[6][6]: an array of integers

>>>Returns
   int: the maximum hourglass sum

>>>Input Format
Each of the 6 lines of inputs arr[i] contains 6 space-separated integers arr[i][j].

>>>Output Format
Print the largest (maximum) hourglass sum found in arr.

>>>Problem URL:
https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true
------------------------------------




>>>Solution

*/

import java.util.*;

public class Array_2D {
    public static int hourglassSum(int[][] arr){
        int sum=0;
        int max = Integer.MIN_VALUE; //Integer.MIN_VALUE is a constant in the Integer class of java.lang package that specifies that stores the minimum possible value for any integer variable in Java.
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int ans = hourglassSum(arr);
        System.out.println(ans);
    }
}
