class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h= nums.length-1;
        int mid = (l+h)/2;

        while(l<=h){
            if(target == nums[mid]) {
                return mid;
            }
            else if (target< nums[mid]){
           h=mid-1;
            }
            else
            l=mid+1;

            mid=(l+h)/2;
        }

        return -1;
    }
}
