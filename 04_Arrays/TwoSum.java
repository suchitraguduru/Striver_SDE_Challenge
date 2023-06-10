public static List<int[]> pairSum(int[] arr, int s) {
       List<int[]> res = new ArrayList<>();
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==s){
                res.add(new int[]{arr[i],arr[j]});
              }
           }
           
       }
       return res;
}
