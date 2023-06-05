public static int findDuplicate(ArrayList<Integer> arr, int n){
        int[] hash = new int[n];
       for(Integer x:arr){
           hash[x]++;
       }int ans=0;
       for(int i=0;i<n;i++){
           if(hash[i]>1)ans=i;
       }
       return ans;
    }
