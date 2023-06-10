public static String fourSum(int[] nums, int target, int n) {
      Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int t = target-nums[i]-nums[j];
                int start = j+1;
                int end = n-1;
                while(start<end){
                    int sum = nums[start]+nums[end];
                    if(sum==t){
                        return "Yes";
                    }else if(sum>t){
                        while(start<end && nums[end]==nums[end-1]){
                            end--;
                        }
                        end--;
                    }else{
                        while(start<end && nums[start]==nums[start+1]){
                            start++;
                        }
                        start++;
                    }
                }
                while(j+1<n-2 && nums[j]==nums[j+1]){
                    j++;
                }
            }
            while(i+1<n-3 && nums[i]==nums[i+1]){
                    i++;
                }
        }
        return "No";
  }
