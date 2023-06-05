import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long sum=0;
		long max = 0;
		for(int x:arr){
			sum+=x;
			max = Math.max(sum,max);
			if(sum<0)sum=0;
		}
		return max;
	}

}
