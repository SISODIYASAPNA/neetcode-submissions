class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
   Map<String, List<Integer>> map = new HashMap<>();
   
   List<List<String>> finalList = new ArrayList<>();
for (int i=0;i<strs.length;i++){
 char[] ch = strs[i].toCharArray();
 Arrays.sort(ch);
 String key = new String(ch);
    if(!map.containsKey(key)){
        List<Integer> list = new ArrayList<>();
        list.add(i);
        map.put(key, list);

    }
    else{
           map.get(key).add(i);
    }
  
}
for (List<Integer> values : map.values()) {
    List<String> str = new ArrayList<>();
    for( Integer val : values){
       str.add(strs[val]);
    }
    finalList.add(str);
}
return finalList;
    }
}
