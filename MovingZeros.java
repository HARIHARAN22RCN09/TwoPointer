public class MovingZeros {
     public void moveZeroes(int[] nums) {
        int i =0,j = 1;
        while(j<=nums.length-1){
            if(nums[i]==0){
                if(nums[j]!=0){
                    //swap
                    int c =nums[i];
                    nums[i] = nums[j];
                    nums[j] =c;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                j++;
            }
        }
    }
}
