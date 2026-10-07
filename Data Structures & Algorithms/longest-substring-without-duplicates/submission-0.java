class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int i =0;
        int j=0;
        int count=0;
        int max = 0;
      
        Map<Character, Integer> map = new HashMap<>();
        while(j <= s.length()-1 && i<=j){
            if(!(map.getOrDefault(ch[j], 0) > 0)){
            map.put(ch[j], map.getOrDefault(ch[j], 0) + 1);
              
                count++;
                j++;
                
            }
           else{
         map.put(ch[i], map.get(ch[i]) - 1);
         
            count--;
            i++;
            
           }
            
    max = Math.max(max, count);

        }
        return max;
        
    }
}
