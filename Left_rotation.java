/*
>>> task
   A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. 
   Given an integer, d, rotate the array that many steps left and return the result.

>>> Example

   d = 2
   arr = [1,2,3,4,5]
   After 2 rotations, arr' = [3,4,5,1,2]

>>> Function Description

   Complete the rotateLeft function in the editor below.
   rotateLeft has the following parameters:

   int d: the amount to rotate by
   int arr[n]: the array to rotate

>>> Returns  

   int[n]: the rotated array

>>> Input Format

   The first line contains two space-separated integers that denote n, the number of integers,
    and d, the number of left rotations to perform.

   The second line contains n space-separated integers that describe arr[].

>>> Sample Input

   5 4
   1 2 3 4 5

>>> Sample Output

   5 1 2 3 4

>>> Problem URL:
   https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true
---------------------------------------





>>> Solution

*/
import java.util.*;


public class Left_rotation{
    public static void rotateLeft(int d, int[] arr){
        
        for(int i=0; i<d; i++){
           int temp = arr[0];
           for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
           arr[arr.length-1] = temp;
        }
    
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        rotateLeft(d, arr);
    }
}
