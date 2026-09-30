class Solution {
    public boolean isPalindrome(String s) {


        s = s.toLowerCase();

        int i =0,j=s.length()-1;

        char[] arr = s.toCharArray();

        while(i < j){

            while(i<j && !((arr[i]>='a' && arr[i]<='z') || (arr[i]>='0' && arr[i]<='9'))){
                i++;
            }
            while(j>i && !((arr[j]>='a' && arr[j]<='z') || (arr[j]>='0' && arr[j]<='9'))){
                j--;
            }
          // if (i>j)return false;

            if(arr[i]== arr[j]){
                 i++;
                 j--;
            }
            else
            return false;
           
        }
        return true;
        
    }
}
