class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> al = new ArrayList<>();
       
		long t = target;
		
        Arrays.sort(nums);
		
       
         for(int i =0 ;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = (long)nums[i] + nums[j] + nums[left]+nums[right];
					
					List<Integer> a = new ArrayList<>() ;
					
					
                   if(sum ==t){
                 a.add(nums[i]);
					a.add(nums[j]);
					a.add(nums[left]);
					a.add(nums[right]);
					al.add(a);
                   
                    while(left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                    }
                    else if(sum<t){
                    left++;
                    }
                    else{
                        right--;
                    }
                }
            }
         }
        
    return al;
    }
}