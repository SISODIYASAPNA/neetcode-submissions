class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
         if(ch[i]== '(' || ch[i]== '{' || ch[i] == '[')
            stk.push(ch[i]);
        else if(!stk.isEmpty()){
                        if((ch[i]== ')' && stk.peek() == '(')  || (ch[i]== ']' && stk.peek()== '[') || (ch[i]== '}' && stk.peek()== '{') )
          stk.pop();
          else 
        return false;
        }
        else return false;
        

        }
        if(stk.isEmpty())
        return true;
return false;
    }
}
