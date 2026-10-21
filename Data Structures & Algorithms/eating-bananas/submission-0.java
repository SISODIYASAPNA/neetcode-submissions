class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int min=1;
        for(int p: piles){
  max=Math.max(max,p);
        }
int res=0;
        while(min<max){
            int mid=min+(max-min)/2;
         res=fun(piles,mid);
            if(res<=h)
            max=mid;
            else
            min=mid+1;
        }
        return max;
    }

    public int fun(int[] piles, int mid){

        int hours=0;
         for(int p: piles){
        
            hours += (int) Math.ceil((double) p / mid);
         }
            return hours;
         

    }
}
