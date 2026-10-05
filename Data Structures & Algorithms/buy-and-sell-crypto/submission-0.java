class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
      int arr[] = new int[size] ;
      int max=prices[size-1];
      for(int i=size-1;i>=0;i--)
      {
       if(prices[i]>=max){
       arr[i]=prices[i];
       max= prices[i];
      
      }
      else
      arr[i] = max;
      }
      int result = 0;
      for(int i=0; i<prices.length;i++){
        if(arr[i]-prices[i]>result){
            result= arr[i]-prices[i];
        }
      }
      return result;
    }
}
