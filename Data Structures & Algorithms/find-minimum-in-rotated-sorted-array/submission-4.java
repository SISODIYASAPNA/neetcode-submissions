class Solution {
    public int findMin(int[] nums) {
        int max= nums[0];
        if(nums.length==1)
        return max;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]> nums[i+1])
            return nums[i+1];

            
        }
        if(nums.length>1)
        if(nums[nums.length-2]>nums[nums.length-1])
        return nums[nums.length-1];
        return max;
    }

 
 
}
