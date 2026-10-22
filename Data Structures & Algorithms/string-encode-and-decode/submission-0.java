class Solution {
    Map < String, List<String>> mp;
    int count = 1;
    public Solution() {
        mp = new HashMap<>();
    }
    public String encode(List<String> strs) {
        String s = String.valueOf(count);
        mp.put(s, strs);
        count++;
        return s;
    }

    public List<String> decode(String str) {
        return mp.get(str);
    }
}
