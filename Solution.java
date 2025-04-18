//1.TWO SUM
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

import java.util.*;
public class Solution{
    public int[] TwoSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        Solution sol = new Solution();
        int[] result = sol.TwoSum(arr,target);
        if(result.length==2){
            System.out.println("["+result[0]+","+result[1]+"]");
        }else{
            System.out.println("No valid pair found.");
        }
    }
}