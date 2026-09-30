class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0;
        int j= s.length()-1;
        s = s.toLowerCase();
        while(i<j){
            char l= s.charAt(i);
            char r= s.charAt(j);
      
boolean isLAlphanumeric = (l >= 'a' && l <= 'z')  || (l >= '0' && l <= '9'); 
boolean isRAlphanumeric = (r >= 'a' && r <= 'z')  || (r >= '0' && r <= '9');

if (isLAlphanumeric && isRAlphanumeric) {

if(s.charAt(i) == s.charAt(j)){
    i++;
    j--;
    }

    else 
    return false;
    
}
  else if(!isLAlphanumeric){
  i++;
  }
  else if(!isRAlphanumeric){
  j--;
  }
 }  
 return true;  
 }

}
