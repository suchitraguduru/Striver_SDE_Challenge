import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int max = Integer.MIN_VALUE,maxidx=0,minidx=0,p=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            
            if(prices.get(i)<min){
                min = prices.get(i);
                minidx=i;
                max = prices.get(i);
                maxidx = i;
            }
            if(prices.get(i)>max && maxidx>=minidx){
                max = prices.get(i);
                maxidx=i;
                if(p<max-min){
                    p=max-min;
                }
            }
            
        }
        
        
        return p;
    }
}
