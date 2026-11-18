class Threesum{
    public static List<List<Integer>> threeSum(int[] nums){
 
   List<List<Integer>> al = new ArrayList<>();
     
          Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i>0&&nums[i]==nums[i-1]){
				continue;
			}
			if(nums[i]>0){
				break;
			}
			int left = i+1, right = nums.length-1;
			while(left<right){
				int sum = nums[i]+nums[left]+nums[right];
				if(sum==0){
					ArrayList<Integer> a = new ArrayList<>();
					a.add(nums[i]);
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
				else if(sum<0){
					left++;
				}
				else{
					right--;
				}
			}
        }
            
        
    return al;
 
 
 
 
 }
}


