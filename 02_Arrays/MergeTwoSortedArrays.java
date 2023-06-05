import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int nums1[], int nums2[], int m, int n) {
       ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(i<m){
                arr.add(nums1[i]);
            }
            if(i<n){
                arr.add(nums2[i]);
            }
            
        }
        Collections.sort(arr);
        for(int i=0;i<nums1.length;i++){
            nums1[i]=arr.get(i);
        }
        return nums1;
    }
}
