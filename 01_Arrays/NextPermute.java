import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) 
	{
		int id1=-1;
        int id2 = -1;
        for(int i=nums.size()-2;i>=0;i--){
            if(nums.get(i)<nums.get(i+1)){
                id1=i;
                break;
            }
        }
        if(id1==-1){
            Collections.sort(nums);
        }else{
            for(int i=nums.size()-1;i>=0;i--){
                if(nums.get(i)>nums.get(id1)){
                    id2=i;
                    break;
                }
            }
            swap(nums,id1,id2);
            reverse(nums,id1+1);
        }
		return nums;
    }
    static void swap(ArrayList<Integer> nums,int i,int j){
        int temp = nums.get(i);
         nums.set(i,nums.get(j));
        nums.set(j,temp);
    }
    static void reverse(ArrayList<Integer> nums, int start){
        int n = nums.size()-1;
        while(start<n){
            swap(nums,start,n);
            start++;
            n--;
        }
    }
}
