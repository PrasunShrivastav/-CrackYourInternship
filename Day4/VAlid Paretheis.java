class Solution {
    public boolean isValid(String s) {
        Stack <Character> brackets = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(') brackets.push(')');
            else if ( c == '{') brackets.push('}');
            else if ( c == '[') brackets.push(']');
            else { 
                if(brackets.isEmpty() || brackets.pop() != c) return false ;
            }


        }
        return brackets.isEmpty();
        
    }
}