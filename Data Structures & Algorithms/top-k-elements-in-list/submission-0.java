class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(int key : mp.keySet()){

            int frequency = mp.get(key);
            if(bucket[frequency] == null)
            bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        int []  res  = new int[k];
        int count=0;
        int count1= 0;
        for(int i=bucket.length-1;i>=0 && count<k;i--){
            if(bucket[i]!=null)
            {
                for(Integer j: bucket[i]){
                    res[count]= j;
                    count++;
                }
                
            }
        }
        return res;
    }
}
