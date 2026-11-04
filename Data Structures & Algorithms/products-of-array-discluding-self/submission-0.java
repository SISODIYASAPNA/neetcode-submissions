class Solution {
    public int[] productExceptSelf(int[] nums) {
        
         int[] prifix = new int[nums.length];
        int[] suffix = new int[nums.length];
        
        prifix[0]=1;
        suffix[nums.length-1]=1;

        for(int i=1;i<nums.length;i++){
            prifix[i]= nums[i-1]* prifix[i-1] ;     
             }

             for(int i=nums.length-2;i>=0;i--){
            suffix[i]= nums[i+1]* suffix[i+1] ;     
             }

          for(int i=0;i<nums.length;i++){
          nums[i]= suffix[i]* prifix[i];


          }
           return nums;
    }

   
}  
